package com.example.demo.repository;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.demo.Flower.Flower;
import com.example.demo.Flower.FlowerColor;
import com.example.demo.Flower.FlowerSpecs;
import com.example.demo.Flower.FlowerType;

@Repository
public class FlowerRepository {
    private final List<Flower> flowers = new ArrayList<>();

    public FlowerRepository() {
        flowers.add(new Flower(25.0, 12.5, new FlowerSpecs(FlowerColor.RED, FlowerType.ROSE)));
        flowers.add(new Flower(18.0, 8.25, new FlowerSpecs(FlowerColor.BLUE, FlowerType.TULIP)));
        flowers.add(new Flower(12.0, 5.5, new FlowerSpecs(FlowerColor.GREEN, FlowerType.CHAMOMILE)));
    }

    public List<Flower> findAll() {
        return Collections.unmodifiableList(flowers);
    }

    public Flower save(Flower flower) {
        Flower copy = new Flower(flower);
        flowers.add(copy);
        return copy;
    }
}

