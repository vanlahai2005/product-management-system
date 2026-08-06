package com.levan.product_management.product.dto;

import java.math.BigDecimal;

import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.Digits;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.PositiveOrZero;
import jakarta.validation.constraints.Size;

public class ProductRequest {

    @NotBlank(message = "Product name must not be blank")
    @Size(
        max = 150,
        message = "Product name must not exceed 150 characters"
    )
    private String name;

    @Size(
        max = 1000,
        message = "Description must not exceed 1000 characters"
    )
    private String description;

    @NotNull(message = "Product price must not be null")
    @DecimalMin(
        value = "0.01",
        message = "Product price must be greater than 0"
    )
    @Digits(
        integer = 13,
        fraction = 2,
        message = "Product price must contain at most 13 integer digits and 2 decimal digits"
    )
    private BigDecimal price;

    @NotNull(message = "Stock quantity must not be null")
    @PositiveOrZero(message = "Stock quantity must be greater than or equal to 0")
    private Integer stockQuantity;

    public ProductRequest() {
    }

    public ProductRequest(
        String name,
        String description,
        BigDecimal price,
        Integer stockQuantity
    ) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.stockQuantity = stockQuantity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public Integer getStockQuantity() {
        return stockQuantity;
    }

    public void setStockQuantity(Integer stockQuantity) {
        this.stockQuantity = stockQuantity;
    }
}
