package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.PricingRule;

public interface PricingRuleRepository  extends JpaRepository<PricingRule,Long>{

}
