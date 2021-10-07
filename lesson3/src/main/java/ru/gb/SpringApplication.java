package ru.gb;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import ru.gb.Cart;
import ru.gb.CartConfiguration;
import ru.gb.ProductRepository;

public class SpringApplication {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(CartConfiguration.class);
        Cart cart = context.getBean(Cart.class);
        System.out.println(cart);
        ProductRepository repository = context.getBean(ProductRepository.class);
        System.out.println(repository);
    }
}
