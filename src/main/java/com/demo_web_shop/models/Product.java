package com.demo_web_shop.models;

public class Product {
    String quantity;

    public Product setQuantity(String quantity) {
        this.quantity = quantity;
        return this;
    }

    public String getQuantity() {
        return quantity;
    }
}
