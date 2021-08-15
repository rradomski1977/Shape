package com.kodilla.good.patterns.food2Door;

import java.util.Map;

public class ExtraFoodShop implements Producer {

    private Map<Product, Integer> resources;

    public ExtraFoodShop(Map<Product, Integer> resources) {
        this.resources = resources;
    }

    private boolean orderVerifier(Map<Product, Integer> order) {
        for (Map.Entry<Product, Integer> entry: order.entrySet()) {
            if (entry.getValue() < 0 || entry.getValue() > resources.get(entry.getKey())) {
                return false;
            }
        }
        return true;
    }

    @Override
    public boolean process(Order order) {
        if (orderVerifier(order.getPiecesOfProducts())) {
            System.out.println("Potwierdzamy, że zamówienie zostało przyjęte do realizacji. " +
                    "Całkowita cena zakupu to " + order.orderPrice() + " złotych");
            return true;
        }
        System.out.println("Brak produktów. Prosimy o kontakt w późniejszym terminie.");
        return false;
    }
}