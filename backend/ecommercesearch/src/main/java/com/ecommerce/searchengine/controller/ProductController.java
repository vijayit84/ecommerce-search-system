package com.ecommerce.searchengine.controller;

import lombok.RequiredArgsConstructor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import com.ecommerce.searchengine.service.ProductSearchService;
import com.ecommerce.searchengine.entity.Product;

@RestController
@RequestMapping("/api/products")
@CrossOrigin("*")
public class ProductController {

    @Autowired
    private  ProductSearchService productSearchService;

    @GetMapping("/search")
    public List<Product> search(
            @RequestParam String keyword) {

        return productSearchService.search(keyword);
    }
}