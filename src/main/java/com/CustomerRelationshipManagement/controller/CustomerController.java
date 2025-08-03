package com.CustomerRelationshipManagement.controller;

import com.CustomerRelationshipManagement.CustomerRelationshipManagementApplication;
import com.CustomerRelationshipManagement.entity.Customer;
import com.CustomerRelationshipManagement.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import org.springframework.http.ResponseEntity;


@RestController
@RequestMapping("/api/customers")
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    @PostMapping("/insert")
    public Customer insertCustomer(@RequestBody Customer customer) {

        return customerService.insertCustomer(customer);
    }

    @GetMapping("/list")
    public List<Customer> getCustomersList() {
        return customerService.getAllCustomers();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Customer> getCustomerById(@PathVariable Integer id) {
        Customer customer = customerService.getCustomerById(id);
        return ResponseEntity.ok(customer);
    }

    @PutMapping("/update")
    public ResponseEntity<String> updateCustomer(@RequestBody Customer customer) {
        String result = customerService.updateCustomer(customer);
        return ResponseEntity.ok(result);
}
@DeleteMapping("/delete/{id}")

    public ResponseEntity<String> deleteCustomerById(@PathVariable Integer id) {
        String result = customerService.deleteCustomerById(id);
        return ResponseEntity.ok(result);
    }

}

