package com.example.backend_sample.service;

import com.example.backend_sample.domain.product.Product;

import java.util.List;

public interface ProductService {
    public List<Product> findAll();
}