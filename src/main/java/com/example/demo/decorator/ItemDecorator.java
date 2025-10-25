package com.example.demo.decorator;

import com.example.demo.order.Item;

public abstract class ItemDecorator extends Item {
    protected final Item item;

    protected ItemDecorator(Item item, String extraDescription) {
        super(item.getDescription() + extraDescription);
        this.item = item;
    }
}

