package com.CustomerRelationshipManagement.service.impl;

import com.CustomerRelationshipManagement.dao.CustomerDao;
import com.CustomerRelationshipManagement.entity.Customer;
import com.CustomerRelationshipManagement.service.CustomerService;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class CustomerServiceImpl implements CustomerService {

    @Autowired
   private CustomerDao customerDao;

    @Override
    public Customer insertCustomer(Customer customer) {

        return customerDao.save(customer);
    }

    @Override
    public List<Customer> getAllCustomers() {
        return customerDao.findAll();
    }


    @Override
    public Customer getCustomerById(Integer id) {
        return customerDao.findById(id)
                .orElseThrow(() -> new RuntimeException("Customer not found with ID: " + id));
    }
    @Override
    public String updateCustomer(Customer customer) {
        if (!customerDao.existsById(customer.getId())) {
            throw new RuntimeException("Cannot update. Customer not found with ID: " + customer.getId());
        }
        customerDao.save(customer);
        return "Customer updated successfully.";
    }
@Override
    public String deleteCustomerById(Integer id) {

        if (customerDao.existsById(id)) {
        customerDao.deleteById(id);}
        else {return "Customer not found with ID: " + id;}
        return "Customer deleted successfully.";

    }

}

