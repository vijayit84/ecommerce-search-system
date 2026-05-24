package com.ecommerce.searchengine.repository;

import java.util.List;

import com.ecommerce.searchengine.entity.Product;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface ProductRepository extends ElasticsearchRepository<Product, Long> {

	List<Product> findByNameContaining(String name);
}
