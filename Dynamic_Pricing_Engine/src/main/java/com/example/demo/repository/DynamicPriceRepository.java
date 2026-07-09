package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.DynamicPrice;



public interface DynamicPriceRepository extends JpaRepository<DynamicPrice,Long> {

}
