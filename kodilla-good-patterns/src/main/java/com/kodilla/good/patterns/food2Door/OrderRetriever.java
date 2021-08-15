package com.kodilla.good.patterns.food2Door;

import java.util.HashMap;
import java.util.Map;

public class OrderRetriever {

    public Order retrieve() {

        Product glutenFreeRice = new Product("Ryż bezglutenowy - 1 kg", 15.60);
        Product milkChocolate = new Product("Czekolada mleczna - 200 g", 5.45);
        Product butter = new Product("Masło - 100 g", 5.00);

        Map<Product, Integer> order = new HashMap<>();
        order.put(glutenFreeRice, 3);
        order.put(milkChocolate, 5);
        order.put(butter, 2);

        return new Order(order, "120905");
    }
}