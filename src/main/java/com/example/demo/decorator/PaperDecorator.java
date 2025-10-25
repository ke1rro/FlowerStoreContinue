package com.example.demo.decorator;

import com.example.demo.order.Item;

public class PaperDecorator extends ItemDecorator {

    public PaperDecorator(Item item) {
        super(item, " wrapped in paper");
    }

    @Override
    public double getPrice() {
        return 13 + item.getPrice();
    }
}

