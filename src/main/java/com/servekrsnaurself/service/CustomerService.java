package com.servekrsnaurself.service;

import com.servekrsnaurself.model.Customer;

import java.util.List;

public interface CustomerService {
    public Customer saveCustomer(Customer customer);

    public List<Customer> getAllCustomer();

}
