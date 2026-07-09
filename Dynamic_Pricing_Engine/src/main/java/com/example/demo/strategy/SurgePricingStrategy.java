package com.example.demo.strategy;

import org.springframework.stereotype.Component;

@Component
public class SurgePricingStrategy implements PricingStrategy {
    @Override
	public double calculate(double price,double value)
 {
	 return price+(price*value/100);
 }
}
