package com.example.demo.decorator;

import com.example.demo.order.Item;

public class BasketDecorator extends ItemDecorator {

    public BasketDecorator(Item item) {
        super(item, " with basket");
    }

    @Override
    public double getPrice() {
        return 4 + item.getPrice();
    }
}

