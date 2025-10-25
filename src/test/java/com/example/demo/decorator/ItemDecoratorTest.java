package com.example.demo.decorator;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import com.example.demo.order.SimpleItem;

class ItemDecoratorTest {

    @Test
    void decoratorsStackPriceAndDescription() {
        SimpleItem base = new SimpleItem("Bucket", 50);
        RibbonDecorator decorated = new RibbonDecorator(new PaperDecorator(base));

        assertEquals(50 + 13 + 40, decorated.getPrice());
        assertTrue(decorated.getDescription().contains("wrapped in paper"));
        assertTrue(decorated.getDescription().contains("with ribbon"));
    }
}

