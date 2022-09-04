package com.example.demo.controllers;

import com.example.demo.entities.Customer;
import com.example.demo.services.ICustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CustomerController {

    @Autowired
    private ICustomerService service;

    @GetMapping("/api/customers")
    public List<Customer> getAll(){
        return service.getAll();
    }

    @GetMapping("/api/customers/{id}")
    public Customer getUniqueCustomer(@PathVariable String id){
        return service.getUniqueCustomer(Long.parseLong(id));
    }

    @DeleteMapping("/api/customers/{id}")
    public void removeCustomerById(@PathVariable String id){
        service.removeCustomerById(Long.parseLong(id));
    }

    @PostMapping("/api/customers")
    public void saveCustomer(@RequestBody Customer customer){
        service.saveCustomer(customer);
    }
}
