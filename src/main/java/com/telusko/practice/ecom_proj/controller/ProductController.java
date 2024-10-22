package com.telusko.practice.ecom_proj.controller;

import com.telusko.practice.ecom_proj.model.Product;
import com.telusko.practice.ecom_proj.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class ProductController {

    @Autowired
    private ProductService service;


    @RequestMapping("/")
    public String greet(){
        return "Hello, Pratyush !";
    }

    @GetMapping("/products")
    public List<Product> getAllProducts(){
        return service.getAllProducts();
    }
}
