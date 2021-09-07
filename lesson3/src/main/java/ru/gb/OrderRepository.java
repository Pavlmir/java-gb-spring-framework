package ru.gb;

import java.time.LocalDate;
import java.util.*;

public class OrderRepository {
    private List<Order> orders;

    public OrderRepository() {
        this.orders = new ArrayList<>(
                List.of(
                        new Order(1, LocalDate.now(), 546.89F, List.of(
                                new Product(1, "Toys", 100.50F),
                                new Product(2, "Spirits", 500.50F),
                                new Product(3, "Bakery", 10.99F),
                                new Product(4, "T-Shirts", 49.99F),
                                new Product(5, "Ground meet", 19.99F)
                        ))
                )
        );
    }

    public Optional<Order> findById(int id) {
        return orders.stream().filter(o -> o.getId() == id).findFirst();
    }

    public List<Order> findAll() {
        return orders;
    }

    public void add(Order order) {
        this.orders.add(order);
    }


    @Override
    public String toString() {
        return "OrderRepository{" +
                "orders=" + orders +
                '}';
    }
}
