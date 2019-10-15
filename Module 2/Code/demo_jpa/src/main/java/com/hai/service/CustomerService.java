package com.hai.service;

import com.hai.entity.Customer;

import java.util.List;

public interface CustomerService {

    List<Customer> showCustomer();

    public void addCustomer(Customer customer);

    public void deleteCustomer(Long id);

    public Customer editCustomer(Long id);
}
