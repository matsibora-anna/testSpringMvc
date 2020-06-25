package com.matsibora.test.service;

import com.matsibora.test.entity.Customer;
import com.matsibora.test.entity.Order;
import com.matsibora.test.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    private OrderRepository orderRepository;

    @Override
    public List<Order> getOrders() {
        return orderRepository.findAll();
    }

    @Override
    public Order findById(Integer id) {
        return orderRepository.findById(id).get();
    }

    @Override
    public void save(Order order) {
        orderRepository.save(order);
    }
}
