import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class SpringApplication {
    public static void main(String[] args) {

        ApplicationContext context = new AnnotationConfigApplicationContext(SpringContextConfiguration.class);

        Cart cart1 = context.getBean("cart", Cart.class);
        cart1.put(1);
        cart1.put(3);
        cart1.showList();

        System.out.println();

        Cart cart2 = context.getBean("cart", Cart.class);
        cart2.put(2);
        cart2.put(4);
        cart1.put(5);
        cart2.showList();

        System.out.println();

        cart2.remove(4);
        cart2.put(3);
        cart2.showList();
    }
}