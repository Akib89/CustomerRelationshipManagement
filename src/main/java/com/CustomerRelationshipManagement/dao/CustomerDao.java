package com.CustomerRelationshipManagement.dao;

import com.CustomerRelationshipManagement.entity.Customer;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;

public class CustomerDao {

    //database
//    @Autowired
    SessionFactory sf;

    public CustomerDao(SessionFactory sf) {
        super();
        this.sf = sf;
    }


    public String insertCustomer(Customer customer) {

Session session = sf.openSession();

Transaction tr = session.beginTransaction();

session.save(customer);
tr.commit();
session.close();
return "Customer inserted";
//insert, update, delete->

    }
}
