package com.matsibora.test.service;

import com.matsibora.test.entity.Customer;

import javax.persistence.criteria.CriteriaBuilder;
import java.util.List;

public interface CustomerService {

    List<Customer> getCustomers();
    Customer findById(Integer id);
    void save(Customer customer);
}
