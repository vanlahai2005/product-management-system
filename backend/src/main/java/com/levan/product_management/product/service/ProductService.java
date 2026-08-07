package com.levan.product_management.product.service;

import java.util.List;

import com.levan.product_management.product.dto.ProductRequest;
import com.levan.product_management.product.dto.ProductResponse;

public interface ProductService {
    ProductResponse createProduct(ProductRequest productRequest);

    List<ProductResponse> getAllProducts();

    ProductResponse getProductById(Long id);

    ProductResponse updateProduct(Long id, ProductRequest productRequest);

    void deleteProduct(Long id);
}
