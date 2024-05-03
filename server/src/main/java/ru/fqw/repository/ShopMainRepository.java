package ru.fqw.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.fqw.model.Product;

@Repository
public interface ShopMainRepository extends JpaRepository<Product,Long> {
}
