package com.example.demo.Contrroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.service.PricingService;

@RestController
@RequestMapping("/pricing")
public class PricingController {

	@Autowired
	private PricingService pricingservice;
	
	@GetMapping("/{productId}")
	public Double calculate(@PathVariable Long productId)
	{
		return pricingservice.calculatePrice(productId);
	}
}
