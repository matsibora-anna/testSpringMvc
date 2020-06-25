package com.matsibora.test.service;

import com.matsibora.test.entity.Order;

import java.util.List;

public interface OrderService {

    List<Order> getOrders();
    Order findById(Integer id);
    void save(Order customer);
}
