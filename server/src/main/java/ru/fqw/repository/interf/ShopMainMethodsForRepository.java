package ru.fqw.repository.interf;

import ru.fqw.dao.ProductDTO;
import ru.fqw.model.Product;

/**
 * Методы для взаимодействия с БД
 */
public interface ShopMainMethodsForRepository {

    Product getProductByName(ProductDTO productDTO);
    Product getProductById(int id);
    Product getAllProducts();
    void deleteProductById(int id);

    /**
     * Получение общего количества всех существующих продуктов в магазине
     */
    String getAllProductsInShopMethod();

}
