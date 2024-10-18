package com.anmolgill.makeupstore.repository;

import com.anmolgill.makeupstore.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
    Product findByName(String name);
}