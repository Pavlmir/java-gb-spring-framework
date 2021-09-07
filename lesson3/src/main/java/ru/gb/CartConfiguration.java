package ru.gb;

import config.RootWebApplicationConfig;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;
import config.WebMvcApplicationConfig;

@Configuration
public class CartConfiguration {

    @Bean
    public ProductRepository productRepository() {
        return new ProductRepository();
    }

    @Bean
    public Cart cart(ProductRepository productRepository) {
        return new Cart(productRepository);
    }

    @Bean
    public OrderRepository orderRepository() {
        return new OrderRepository();
    }

    public static class FirstWebApplicationInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {

        @Override
        protected String[] getServletMappings() {
            return new String[] {"/"};
        }

        @Override
        protected Class<?>[] getRootConfigClasses() {
            return new Class[] {RootWebApplicationConfig.class};
        }

        @Override
        protected Class<?>[] getServletConfigClasses() {
            return new Class[] {WebMvcApplicationConfig.class};
        }

    }
}
