package com.CustomerRelationshipManagement.service;

import com.CustomerRelationshipManagement.entity.Order;
import com.CustomerRelationshipManagement.entity.Product;

import java.util.List;
import java.util.Optional;

public interface ProductService {

    List<Product> findAll();

    Optional<Product> findById(Long id);

    Product save(Product product);

    boolean deleteById(Long id);


}
