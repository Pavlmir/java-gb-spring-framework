package ru.gb;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Order {
    private int id;
    private LocalDate date;
    private float cost;
    private List<Product> products;

    public Order() {
    }

    public Order(int id, LocalDate date, float cost, List<Product>  products) {
        this.id = id;
        this.date = date;
        this.cost = cost;
        this.products = new ArrayList<>();
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public void setCost(float cost) {
        this.cost = cost;
    }

    public int getId() {
        return id;
    }

    public float getCost() {
        return cost;
    }

    public LocalDate getDate() {
        return date;
    }
}
