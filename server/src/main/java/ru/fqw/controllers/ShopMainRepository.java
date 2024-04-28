package ru.fqw.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ShopMainRepository {

    @GetMapping
    public String getProductById(){
        return "hello";
    }
}
