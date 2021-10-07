import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component("productRepository")
public class ProductRepository {

    private List<Product> list = new ArrayList<>();

    public ProductRepository() {
        list.add(new Product(1, "Пончик", 150d));
        list.add(new Product(2, "Крендель", 80d));
        list.add(new Product(3, "Пирог", 100d));
        list.add(new Product(4, "Эклер", 120d));
        list.add(new Product(5, "Торт", 700d));
    }

    public List<Product> getList() {
        return list;
    }

    public Product findById(Integer id) {
        for (Product pr : list) {
            if (pr.getId().equals(id)) {
                return pr;
            }
        }
        return null;
    }
}