package com.levan.product_management.product.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.levan.product_management.product.entity.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
}