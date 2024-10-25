package com.telusko.practice.ecom_proj.service;

import com.telusko.practice.ecom_proj.model.Product;
import com.telusko.practice.ecom_proj.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;
import java.io.IOException;
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

    public Product addProduct(Product product, MultipartFile imageFile) throws IOException {
        product.setImageName(imageFile.getOriginalFilename());
        product.setImageType(imageFile.getContentType());
        product.setImageData(imageFile.getBytes());
        return prodRepo.save(product);
    }

    public Product updateProduct(int id, Product product, MultipartFile imageFile) throws IOException {
        product.setImageData(imageFile.getBytes());
        product.setImageName(imageFile.getOriginalFilename());
        product.setImageType(imageFile.getContentType());
        return prodRepo.save(product);
    }

    public void deleteProduct(int id) {
        prodRepo.deleteById(id);
    }

    public List<Product> searchProducts(String keyword) {
        return prodRepo.searchProducts(keyword);
    }
}
