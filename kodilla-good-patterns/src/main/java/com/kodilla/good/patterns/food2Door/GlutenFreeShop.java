package com.kodilla.good.patterns.food2Door;

public class GlutenFreeShop implements Producer {
    @Override
    public boolean process(Order order) {
        System.out.println("Hurtownia jest zamknięta do 15-08. Prismy o kontakt po tym terminie.");
        return false;
    }
}