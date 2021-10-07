package controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import ru.gb.Order;
import ru.gb.OrderRepository;
import ru.gb.Product;

@Controller
public class OrderController {

    private final OrderRepository repository;

    public OrderController(OrderRepository repository) {
        this.repository = repository;
    }

    @RequestMapping(value = "/orders", method = RequestMethod.GET)
    public String findAll(Model model) {
        model.addAttribute("orders", repository.findAll());
        return "orders";
    }

    @RequestMapping(value = "/orders/{id}", method = RequestMethod.DELETE)
    public void delete(@PathVariable String id) {
        // #TODO TO BE DEFINED LATER
    }

    @RequestMapping(value = "/orders/add", method = RequestMethod.GET)
    public String add(Model model) {
        model.addAttribute("order", new Order());
        return "orders-add";
    }

    @RequestMapping(value = "/orders/add", method = RequestMethod.POST)
    public String add(Order order) {
        repository.add(order);
        return "orders";
    }

}
