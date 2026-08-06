package com.levan.product_management.product.dto;

import java.math.BigDecimal;
import java.time.OffsetDateTime;

public class ProductResponse {

    private final Long id;
    private final String name;
    private final String description;
    private final BigDecimal price;
    private final Integer stockQuantity;
    private final OffsetDateTime createdAt;
    private final OffsetDateTime updatedAt;

    public ProductResponse(
        Long id,
        String name,
        String description,
        BigDecimal price,
        Integer stockQuantity,
        OffsetDateTime createdAt,
        OffsetDateTime updatedAt
    ) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.price = price;
        this.stockQuantity = stockQuantity;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public Integer getStockQuantity() {
        return stockQuantity;
    }

    public OffsetDateTime getCreatedAt() {
        return createdAt;
    }

    public OffsetDateTime getUpdatedAt() {
        return updatedAt;
    }
}