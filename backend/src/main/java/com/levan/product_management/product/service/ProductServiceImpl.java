package com.levan.product_management.product.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.levan.product_management.product.dto.ProductRequest;
import com.levan.product_management.product.dto.ProductResponse;
import com.levan.product_management.product.entity.Product;
import com.levan.product_management.product.exception.ProductNotFoundException;
import com.levan.product_management.product.mapper.ProductMapper;
import com.levan.product_management.product.repository.ProductRepository;

@Service
public class ProductServiceImpl implements ProductService {
    private final ProductRepository productRepository;
    private final ProductMapper productMapper;

    public ProductServiceImpl(ProductRepository productRepository, ProductMapper productMapper) {
        this.productRepository = productRepository;
        this.productMapper = productMapper;
    }
    @Override
    @Transactional
    public ProductResponse createProduct(ProductRequest productRequest) {
        Product product = productMapper.toEntity(productRequest);
        Product savedProduct = productRepository.save(product);
        return productMapper.toResponse(savedProduct);
    }
    @Override
    @Transactional(readOnly = true)
    public List<ProductResponse> getAllProducts() {
        List<Product> products = productRepository.findAll();
        List<ProductResponse> productResponses = new ArrayList<>();
        for (Product product : products) {
            ProductResponse response = productMapper.toResponse(product);
            productResponses.add(response);
        }
        return productResponses;
    }
    @Override
    @Transactional(readOnly = true)
    public ProductResponse getProductById(Long id) {
        Product product = findProductById(id);
        return productMapper.toResponse(product);
    }
    @Override
    @Transactional
    public ProductResponse updateProduct(Long id, ProductRequest productRequest) {
        Product product = findProductById(id);
        productMapper.updateEntity(product, productRequest);
        Product updatedProduct = productRepository.save(product);
        return productMapper.toResponse(updatedProduct);
    }
    @Override
    @Transactional
    public void deleteProduct(Long id) {
        Product product = findProductById(id);
        productRepository.delete(product);
    }
    private Product findProductById(Long id) {
        return productRepository.findById(id)
                .orElseThrow(() -> new ProductNotFoundException(id));
    }
}
