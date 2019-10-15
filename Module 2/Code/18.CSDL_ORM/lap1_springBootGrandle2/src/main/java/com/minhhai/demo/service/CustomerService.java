package com.minhhai.demo.service;

import com.minhhai.demo.model.Customer;
import com.minhhai.demo.repository.CustomerRepository;

import java.util.List;

public interface CustomerService extends CustomerRepository {
    List<Customer> findAll();

    Customer findById(Long id);

    Customer save(Customer customer);

    void remove(Long id);
}