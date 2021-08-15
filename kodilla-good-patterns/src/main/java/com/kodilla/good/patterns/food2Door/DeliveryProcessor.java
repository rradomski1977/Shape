package com.kodilla.good.patterns.food2Door;

public class DeliveryProcessor {

    private Producer producer;
    private Order order;

    public DeliveryProcessor(Producer producer, Order order) {
        this.producer = producer;
        this.order = order;
    }

    public void process() {
        boolean orderPossible = producer.process(order);
        if (orderPossible) {
            System.out.println("Twoje zamówienie wkrótce zostanie dostarczone.");
        } else {
            System.out.println("Niestety Twoje zamówienie nie może zostać zrealizowane z powodu wyczerpania się stanu magazynowego");
        }
    }
}
