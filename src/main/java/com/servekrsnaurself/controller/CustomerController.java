package com.servekrsnaurself.controller;

import com.servekrsnaurself.model.Customer;
import com.servekrsnaurself.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/customer")
public class CustomerController {
    @Autowired
    private CustomerService customerService;
    @PostMapping("/add")
    public String add(@RequestBody Customer customer){
        customerService.saveCustomer(customer);
        return ("new donar has been added");
    }
    @GetMapping("/getAll")
    public List<Customer> getAllCustomers(){
        return customerService.getAllCustomer();
    }
}
