package com.example.demo.decorator;

import com.example.demo.order.Item;

public class RibbonDecorator extends ItemDecorator {

    public RibbonDecorator(Item item) {
        super(item, " with ribbon");
    }

    @Override
    public double getPrice() {
        return 40 + item.getPrice();
    }
}

