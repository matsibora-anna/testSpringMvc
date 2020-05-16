package com.matsibora.test.service;

import com.matsibora.test.entity.Item;
import com.matsibora.test.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OderServiceImpl implements OderService {

    @Autowired
    private OrderRepository orderRepository;

    @Override
    public List<Item> getOrders() {
        return orderRepository.findAll();
    }
}