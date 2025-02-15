package com.tns.Springbootex.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tns.Springbootex.entity.Shop;

@Repository
public interface repository extends JpaRepository<Shop, Long> {
}
