package com.example.Ecommerce.EcommerceApp;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class ProductConfig {

    @Bean
    CommandLineRunner commandLineRunner(
            ProductRepository repository){
        return args -> {
                  Product bag = new Product(
                            "Bag",
                            "Bag With Handle various Designs",
                            2000.00,
                            3


            );
                  Product shoe = new Product(
                    "Shoe",
                    "Shoe With Various Designs",
                    5000.00,
                    4

            );
            repository.saveAll(
                    List.of(bag, shoe)
            );

        };
    }
}
