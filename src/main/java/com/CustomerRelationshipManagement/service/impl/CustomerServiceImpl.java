package com.CustomerRelationshipManagement.service.impl;

import com.CustomerRelationshipManagement.repository.CustomerRepository;
import com.CustomerRelationshipManagement.entity.Customer;
import com.CustomerRelationshipManagement.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class CustomerServiceImpl implements CustomerService {

    @Autowired
   private CustomerRepository customerRepository;

    @Override
    public Customer insertCustomer(Customer customer) {

        return customerRepository.save(customer);
    }

    @Override
    public List<Customer> getAllCustomers() {
        return customerRepository.findAll();
    }


    @Override
    public Customer getCustomerById(Integer id) {
        return customerRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Customer not found with ID: " + id));
    }
    @Override
    public String updateCustomer(Customer customer) {
        if (!customerRepository.existsById(customer.getId())) {
            throw new RuntimeException("Cannot update. Customer not found with ID: " + customer.getId());
        }
        customerRepository.save(customer);
        return "Customer updated successfully.";
    }
@Override
    public String deleteCustomerById(Integer id) {

        if (customerRepository.existsById(id)) {
        customerRepository.deleteById(id);}
        else {return "Customer not found with ID: " + id;}
        return "Customer deleted successfully.";

    }

    @Override
    public List<Customer> insertMultipleCustomers(List<Customer> customers) {
        return customerRepository.saveAll(customers);
    }

    @Override
    public List<Customer> getCustomersByFirstName(String firstName) {
        return customerRepository.findAllByFirstNameEqualsIgnoreCase(firstName);
    }

}

