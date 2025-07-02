package com.demo_web_shop.models;

public class Product {
    String quantity;
    String name;

    public Product setQuantity(String quantity) {
        this.quantity = quantity;
        return this;
    }

    public Product setName(String name) {
        this.name = name;
        return this;
    }

    public String getQuantity() {
        return quantity;
    }

    public String getName() {
        return name;
    }
}
