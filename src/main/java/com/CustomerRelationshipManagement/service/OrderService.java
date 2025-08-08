package com.CustomerRelationshipManagement.service;

import com.CustomerRelationshipManagement.entity.Order;

import java.util.List;
import java.util.Optional;

public interface OrderService {

     List<Order> findAll();

     Optional<Order> findById(Long id);

     List<Order> findAllByCustomerId(Integer customerId);

     Order save(Order order);

     boolean deleteById(Long id);

     Order insertOrder(Order order);
     List<Order> getAllOrders();

}
