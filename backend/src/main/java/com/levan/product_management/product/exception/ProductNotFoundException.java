package com.levan.product_management.product.exception;

public class ProductNotFoundException extends RuntimeException {
    public ProductNotFoundException(Long id) {
        super("Product not found with ID: " + id);
    }
}