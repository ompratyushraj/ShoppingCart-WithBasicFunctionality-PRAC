package com.telusko.practice.ecom_proj.service;

import com.telusko.practice.ecom_proj.model.Product;
import com.telusko.practice.ecom_proj.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    @Autowired
    private ProductRepository prodRepo;

    public List<Product> getAllProducts() {
        return prodRepo.findAll();
    }

    public Product getProductById(int id) {
        return prodRepo.findById(id).orElse(null);
    }
}
