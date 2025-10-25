package com.example.demo.order;

public abstract class Item {
    private String description;

    protected Item(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    protected void setDescription(String description) {
        this.description = description;
    }

    public abstract double getPrice();
}

