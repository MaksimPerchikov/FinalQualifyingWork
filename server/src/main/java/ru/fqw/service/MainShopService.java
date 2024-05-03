package ru.fqw.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.fqw.dao.ProductDTO;
import ru.fqw.model.Product;
import ru.fqw.repository.ShopMainRepository;
import ru.fqw.repository.interf.ShopMainMethodsForRepository;

import java.util.List;
import java.util.Optional;

@Service
public class MainShopService implements ShopMainMethodsForRepository {

    private final ShopMainRepository shopMainRepository;
    private final TimerService timerService;

    @Autowired
    public MainShopService(ShopMainRepository shopMainRepository, TimerService timerService) {
        this.shopMainRepository = shopMainRepository;
        this.timerService = timerService;
    }

    @Override
    public Product getProductByName(ProductDTO productDTO) {
        List<Product> all = shopMainRepository.findAll();
        Optional<Product> currentProduct = all.stream()
                .filter(product -> product.getName().equals(productDTO.getName()))
                .findFirst();
        return currentProduct.get();
    }

    /**
     * Получение общего количества всех существующих продуктов в магазине
     */
    @Override
    public String getAllProductsInShopMethod() {
        List<Product> all = shopMainRepository.findAll();
        double start = timerService.timerStartStop();
        String result = "";
        for (int i = 0; i < all.size(); i++) {
            result = result.concat(String.valueOf(all.get(i))) + ", ";
        }
        double endTime = timerService.timerStartStop();;
        timerService.result(start, endTime);
        return "Отчет по общему количеству всех существующих продуктов сформирован.";
    }
/*
    *//**
     * Получение общего количества всех существующих продуктов в магазине
     *//*
    @Override
    public String getAllProductsInShopMethod() {
        List<Product> all = shopMainRepository.findAll();
        double start = timerService.timerStartStop();
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < all.size(); i++) {
            result.append(all.get(i)).append(", ");
        }
        double endTime = timerService.timerStartStop();;
        timerService.result(start, endTime);
        return "Отчет по общему количеству всех существующих продуктов сформирован.";
    }*/

    /**
     * Добавление в БД 100000 новых записей
     */
    private void addNewValues() {
        for (int i = 0; i < 33000; i++) {
            Product product = new Product(i, "TEST " + i, 100 + i, true);
            shopMainRepository.save(product);
        }
    }

    @Override
    public Product getProductById(int id) {
        return null;
    }

    @Override
    public Product getAllProducts() {
        return null;
    }

    @Override
    public void deleteProductById(int id) {

    }
}
