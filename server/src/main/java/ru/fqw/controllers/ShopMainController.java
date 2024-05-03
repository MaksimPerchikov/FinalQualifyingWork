package ru.fqw.controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import ru.fqw.dao.ProductDTO;
import ru.fqw.model.Product;
import ru.fqw.service.MainShopService;

@RestController
@RequestMapping("/shop")
public class ShopMainController {

    private final MainShopService mainService;

    @Autowired
    public ShopMainController(MainShopService mainService) {
        this.mainService = mainService;
    }

    @GetMapping("/get_product")
    public Product getProductByNameMethod(@RequestBody ProductDTO productDTO) {
        return mainService.getProductByName(productDTO);
    }

    @GetMapping("/get_all_products_in_shop")
    public String getAllProductsInShopMethod() {
        return mainService.getAllProductsInShopMethod();
    }
}
