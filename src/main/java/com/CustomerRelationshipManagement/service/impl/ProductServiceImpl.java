package com.CustomerRelationshipManagement.service.impl;

import com.CustomerRelationshipManagement.entity.Order;
import com.CustomerRelationshipManagement.entity.Product;
import com.CustomerRelationshipManagement.repository.ProductRepository;
import com.CustomerRelationshipManagement.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductRepository productRepository;

    @Override
    public List<Product> findAll() {
        return productRepository.findAll();
    }

    @Override
    public Optional<Product> findById(Long id) {
        return productRepository.findById(id);
    }

    @Override
    public Product save(Product product) {
        return productRepository.save(product);
    }

    @Override
    public boolean deleteById(Long id) {
        try {
            if(productRepository.existsById(id)){
                productRepository.deleteById(id);
                return true;
            }
            else {
                throw new Exception("Product with id: "+id+" Not Found");
            }
        }
        catch(Exception e) {
            System.out.println(e.getMessage());
            return false;
        }
    }
}
