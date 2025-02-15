package com.tns.Springbootex.controller;

import java.util.List;

import org.apache.tomcat.util.descriptor.web.ContextService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tns.Springbootex.entity.Shop;

@RestController
@RequestMapping("/shops")
public class Controller {
    @Autowired
    private ContextService service;
    
    @GetMapping
    public List<Shop> getShops() {
        return service.getAllShops();
    }
    
    @PostMapping
    public Shop addShop(@RequestBody Shop shop) {
        return service.addShop(shop);
    }
}
