package com.CustomerRelationshipManagement.repository;

import com.CustomerRelationshipManagement.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OrderRepository extends JpaRepository<Order, Long> {
//    @Query("SELECT model FROM Order model WHERE model.orderBy.id = :customerId")
    List<Order> findAllByOrderById(Integer customerId);
}
