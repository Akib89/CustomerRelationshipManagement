package com.CustomerRelationshipManagement.service;

import com.CustomerRelationshipManagement.dao.CustomerDao;
import com.CustomerRelationshipManagement.entity.Customer;
import java.util.List;

public interface CustomerService {

    Customer insertCustomer(Customer customer);

    List<Customer> getAllCustomers();

    Customer getCustomerById(Integer id);

    String deleteCustomerById(Integer id);

    String updateCustomer(Customer customer);

    List<Customer> insertMultipleCustomers(List<Customer> customers);

    List<Customer> getCustomersByFirstName(String firstName);

}
