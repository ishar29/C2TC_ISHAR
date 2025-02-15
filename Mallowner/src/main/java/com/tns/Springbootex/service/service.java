package com.tns.Springbootex.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tns.Springbootex.entity.Shop;
import com.tns.Springbootex.repository.repository;

@Service
public class service {
    @Autowired
    private repository shopRepository;
    
    public List<Shop> getAllShops() {
        return shopRepository.findAll();
    }
    
    public Shop addShop(Shop shop) {
        return shopRepository.save(shop);
    }
}

