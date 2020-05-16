package com.matsibora.test.service;

import com.matsibora.test.entity.Item;
import com.matsibora.test.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    private CustomerRepository customerRepository;

    @Override
    public List<Item> getCustomers() {
        return customerRepository.findAll();
    }
}
