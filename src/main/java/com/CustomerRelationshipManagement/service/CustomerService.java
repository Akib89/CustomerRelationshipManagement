package com.CustomerRelationshipManagement.service;

import com.CustomerRelationshipManagement.dao.CustomerDao;
import com.CustomerRelationshipManagement.entity.Customer;
import java.util.List;

public interface CustomerService {

    Customer insertCustomer(Customer customer);

    List<Customer> getAllCustomers();

    Customer getCustomerById(Integer id);

}
