package ru.fqw.configuration;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import ru.fqw.model.Product;
import ru.fqw.repository.ShopMainRepository;

@Configuration
public class LoadDataBase {

    private static final Logger log = LoggerFactory.getLogger(LoadDataBase.class);

    @Bean
    CommandLineRunner initEstimation(ShopMainRepository shopMainRepository) {
        return args -> {
            log.info("Preloading " + shopMainRepository
                    .save(new Product(1L, "house", 1234567890, true)));
            log.info("Preloading " + shopMainRepository
                    .save(new Product(2L, "car", 88888, true)));
            log.info("Preloading " + shopMainRepository
                    .save(new Product(3L, "banana", 1, false)));
            log.info("Preloading " + shopMainRepository
                    .save(new Product(4L, "train", 7777777, true)));
        };
    }
}
