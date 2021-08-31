package ru.gb;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Order {
    private int id;
    private Date date;
    private float cost;
    private List<Product> products;

    public Order(int id, Date date, float cost, Product products) {
        this.id = id;
        this.date = date;
        this.cost = cost;
        this.products = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public float getCost() {
        return cost;
    }
}
