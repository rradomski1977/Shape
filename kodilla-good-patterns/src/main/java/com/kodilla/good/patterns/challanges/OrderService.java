package com.kodilla.good.patterns.challanges;

public interface OrderService {
    public default boolean executeOrder(OrderRequest orderRequest) {
        return false;
    }
}
