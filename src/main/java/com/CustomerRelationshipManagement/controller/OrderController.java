package com.CustomerRelationshipManagement.controller;

import com.CustomerRelationshipManagement.entity.Customer;
import com.CustomerRelationshipManagement.entity.Order;
import com.CustomerRelationshipManagement.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/orders")
public class OrderController {

    @Autowired
    private OrderService orderService;

    @PostMapping("/insert")
    public Order insertOrder(@RequestBody Order order){

        return orderService.insertOrder(order);
    }

    @GetMapping("/list")
    public List<Order> getOrdersList() {
        return orderService.getAllOrders();
    }

}
