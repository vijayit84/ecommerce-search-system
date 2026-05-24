// package com.ecommerce.searchengine.configuration;
// import com.ecommerce.searchengine.entity.Product;
// import com.ecommerce.searchengine.repository.ProductRepository;

// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.boot.CommandLineRunner;
// import org.springframework.context.annotation.Bean;
// import org.springframework.context.annotation.Configuration;
// @Configuration
// public class SearchConfiguration {

//     @Autowired
//     private ProductRepository productRepository;

//      @Bean
//     public CommandLineRunner loadData(ProductRepository repository) {
//         return args -> {
//             repository.save(new Product(1L, "Apple iPhone 15 Pro Max", "Apple", "Mobiles", 1499.0));
//             repository.save(new Product(2L, "Samsung Galaxy S24 Ultra", "Samsung", "Mobiles", 1299.0));
//         };
//     }
// }
