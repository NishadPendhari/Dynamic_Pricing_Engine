package com.example.demo.service;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import com.example.demo.entity.DynamicPrice;
import com.example.demo.entity.PricingRule;
import com.example.demo.entity.Product;
import com.example.demo.repository.DynamicPriceRepository;
import com.example.demo.repository.PricingRuleRepository;
import com.example.demo.repository.ProductRepository;
import jakarta.transaction.Transactional;

@Service
@Transactional
public class PricingService {
  
	@Autowired
	private ProductRepository productrepository;
	
	@Autowired
	private PricingRuleRepository pricingrulerepository;
	
	@Autowired
	private DynamicPriceRepository dynamicRepo;
	
	@Cacheable("prices")
	public Double calculatePrice(Long productId)
	{
		Product product=productrepository.findById(productId).orElseThrow(() -> new RuntimeException("Product Not found"));
		double finalPrice=product.getBaseprice();
		
		List<PricingRule>rules=pricingrulerepository.findAll();
		
		for(PricingRule rule:rules)
		{
			if(rule.getType().equalsIgnoreCase("SURGE"))
			{
				finalPrice=finalPrice + (finalPrice * rule.getRuleValue()/100);
			}
			
			if(rule.getType().equalsIgnoreCase("TIME"))
			{
				finalPrice=finalPrice - (finalPrice * rule.getRuleValue()/100);
			}
			if(rule.getType().equalsIgnoreCase("INVENTORY"))
			{
				finalPrice=finalPrice + (finalPrice * rule.getRuleValue()/100);
			}
		}
			
			DynamicPrice dp=new DynamicPrice();
			dp.setProduct(product);
			dp.setFinalPrice(finalPrice);
			dp.setCreatedAt(LocalDateTime.now());
			dynamicRepo.save(dp);
			
			return finalPrice;
			
	}
}
