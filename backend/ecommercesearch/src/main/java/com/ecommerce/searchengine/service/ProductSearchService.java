package com.ecommerce.searchengine.service;

import lombok.RequiredArgsConstructor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

import com.ecommerce.searchengine.repository.ProductRepository;
import com.ecommerce.searchengine.entity.Product;

@Service
public class ProductSearchService {

    @Autowired
    private  ProductRepository productRepository;

    public List<Product> search(String keyword) {
        return productRepository.findByNameContaining(keyword);
    }
}