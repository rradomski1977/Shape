package com.kodilla.good.patterns.challanges;

import java.time.LocalDateTime;

public class OrderRequestRetriever {

    public OrderRequest retrieve() {

        User buyer = new User("Grzegorz", "Jurczyk", "Poznań, ul. Morska 15", "535281735");
        User seller = new User("Jan", "Michalski", "Rzeszów, ul. Przemyska 12C", "555076088");
        Order order = new Order("Book", "23550",48.50,
                LocalDateTime.of(2021, 8,9,12,15),
                LocalDateTime.of(2021, 8,14,16,04));

        return new OrderRequest(buyer, seller, order);
    }
}
