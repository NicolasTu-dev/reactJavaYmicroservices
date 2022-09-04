package com.example.demo.services;

import com.example.demo.entities.Customer;

import java.util.List;

public interface ICustomerService {
    List<Customer> getAll();

    Customer getUniqueCustomer(Long id);

    public void removeCustomerById(Long id);

    public void saveCustomer(Customer customer);
}
