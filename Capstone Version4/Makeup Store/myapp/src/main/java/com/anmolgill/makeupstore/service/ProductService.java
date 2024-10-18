package com.anmolgill.makeupstore.service;

import com.anmolgill.makeupstore.model.Product;
import com.anmolgill.makeupstore.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    // Creates product
    public Product createProduct(Product product) {
        return productRepository.save(product);
    }

    //Id of product selected
    public Optional<Product> getProductById(Long id) {
        return productRepository.findById(id);
    }

    //Product name
    public Product getProductByName(String name) {
        return productRepository.findByName(name);
    }

    //List all products
    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }

    //Delete product
    public void deleteProduct(Long id) {
        productRepository.deleteById(id);
    }
}

