package ru.gb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import ru.gb.domain.Order;
import ru.gb.domain.Product;
import ru.gb.repository.OrderRepository;

import java.util.List;

@Controller
@RequestMapping("/orders")
public class OrderController {

    private final OrderRepository repository;

    public OrderController(OrderRepository repository) {
        this.repository = repository;
    }

    @RequestMapping(method = RequestMethod.GET)
    @ResponseBody
    public List<Order> findAll() {
        return repository.findAll();
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public void delete(@PathVariable int id) {
        repository.remove(id);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    @ResponseBody
    public Order findById(@PathVariable int id) {
        return repository.findById(id).orElseThrow();
    }

    @RequestMapping(method = RequestMethod.POST)
    public List<Order> save(@RequestBody Order order) {
        repository.add(order);
        return repository.findAll();
    }

    @RequestMapping(value = "/index")
    public String index() {
        return "index";
    }

}
