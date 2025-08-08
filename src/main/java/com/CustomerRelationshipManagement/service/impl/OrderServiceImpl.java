package com.CustomerRelationshipManagement.service.impl;

import com.CustomerRelationshipManagement.entity.Order;
import com.CustomerRelationshipManagement.repository.OrderRepository;
import com.CustomerRelationshipManagement.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    private OrderRepository orderRepository;

    @Override
    public List<Order> findAll() {
        return orderRepository.findAll();
    }

    @Override
    public Optional<Order> findById(Long id) {
        return  orderRepository.findById(id);
    }

    @Override
    public List<Order> findAllByCustomerId(Integer customerId) {
        return orderRepository.findAllByOrderById(customerId);
    }

    @Override
    public Order save(Order order) {
        return orderRepository.save(order);
    }

    @Override
    public boolean deleteById(Long id) {
        try {
            if(orderRepository.existsById(id)){
                orderRepository.deleteById(id);
                return true;
            }
            else {
                throw new Exception("Order with id: "+id+" Not Found");
            }
        }
        catch(Exception e) {
            System.out.println(e.getMessage());
            return false;
        }
    }
}
