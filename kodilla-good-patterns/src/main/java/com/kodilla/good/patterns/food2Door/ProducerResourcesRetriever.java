package com.kodilla.good.patterns.food2Door;

import java.util.HashMap;
import java.util.Map;

public class ProducerResourcesRetriever {

    public Map<Product, Integer> retrieve() {
        Product glutenFreeRice = new Product("Ryż bezglutenowy - 1 kg", 15.60);
        Product milkChocolate = new Product("Czekolada mleczna - 200 g", 5.45);
        Product butter = new Product("Masło - 100 g", 5.00);

        Map<Product, Integer> resources = new HashMap<>();
        resources.put(glutenFreeRice, 256);
        resources.put(milkChocolate, 123);
        resources.put(butter, 350);

        return resources ;
    }
}
