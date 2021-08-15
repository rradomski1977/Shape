package com.kodilla.good.patterns.food2Door;

public class HealthyShop implements Producer {
    @Override
    public boolean process(Order order) {
        System.out.println("Zamówienie zostało przyjęte do realizacji.");
        return true;
    }
}
