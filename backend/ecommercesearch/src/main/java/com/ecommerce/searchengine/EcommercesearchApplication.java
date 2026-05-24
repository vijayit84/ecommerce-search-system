package com.ecommerce.searchengine;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.AutoConfigureOrder;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.elasticsearch.repository.config.EnableElasticsearchRepositories;

@SpringBootApplication
@EnableElasticsearchRepositories(basePackages = "com.ecommerce.searchengine.repository")    
@ComponentScan(basePackages = "com.ecommerce.searchengine")
public class EcommercesearchApplication implements CommandLineRunner {

      @Autowired
    private com.ecommerce.searchengine.repository.ProductRepository productRepository;  

    public static void main(String[] args) {
        SpringApplication.run(EcommercesearchApplication.class, args);
    }

    // @Bean
    // public CommandLineRunner loadData(org.springframework.data.elasticsearch.repository.ElasticsearchRepository<com.ecommerce.searchengine.entity.Product, Long> productRepository) {
    //     return args -> {
    //         productRepository.deleteAll();
    //         productRepository.save(new com.ecommerce.searchengine.entity.Product(1L, "Laptop", "Dell", "Electronics", 799.99));
    //         productRepository.save(new com.ecommerce.searchengine.entity.Product(2L, "Mouse", "Logitech", "Accessories", 25.50));
    //     };
    // }


        @Override
    public void run(String... args) throws Exception {
        // This method can be used to initialize data or perform startup tasks
 productRepository.save(new com.ecommerce.searchengine.entity.Product(1L, "Laptop", "Dell", "Electronics", 79999.99));
 productRepository.save(new com.ecommerce.searchengine.entity.Product(2L, "Mouse", "Logitech", "Accessories", 2500.50));
 productRepository.save(new com.ecommerce.searchengine.entity.Product(3L, "iphone", "Apple iphone16 pro max", "Electronics", 129799.99));
 productRepository.save(new com.ecommerce.searchengine.entity.Product(4L, "iphone", "Apple iphone15 pro max", "Electronics", 129799.99));
 productRepository.save(new com.ecommerce.searchengine.entity.Product(5L, "iphone", "Apple iphone17 pro max", "Electronics", 169799.99));
 productRepository.save(new com.ecommerce.searchengine.entity.Product(6L, "iphone", "Apple iphone14", "Electronics", 129799.99));
 productRepository.save(new com.ecommerce.searchengine.entity.Product(7L, "phone", "Samsung", "Electronics", 56925.50));
 
 


    }    
}
