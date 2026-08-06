package com.levan.product_management.product.mapper;

import org.springframework.stereotype.Component;

import com.levan.product_management.product.dto.ProductRequest;
import com.levan.product_management.product.dto.ProductResponse;
import com.levan.product_management.product.entity.Product;

@Component
public class ProductMapper {

    public Product toEntity(ProductRequest request) {
        return new Product(
            request.getName().trim(),
            normalizeDescription(request.getDescription()),
            request.getPrice(),
            request.getStockQuantity()
        );
    }

    public ProductResponse toResponse(Product product) {
        return new ProductResponse(
            product.getId(),
            product.getName(),
            product.getDescription(),
            product.getPrice(),
            product.getStockQuantity(),
            product.getCreatedAt(),
            product.getUpdatedAt()
        );
    }

    public void updateEntity(
        Product product,
        ProductRequest request
    ) {
        product.setName(request.getName().trim());
        product.setDescription(
            normalizeDescription(request.getDescription())
        );
        product.setPrice(request.getPrice());
        product.setStockQuantity(request.getStockQuantity());
    }

    private String normalizeDescription(String description) {
        if (description == null || description.isBlank()) {
            return null;
        }

        return description.trim();
    }
}