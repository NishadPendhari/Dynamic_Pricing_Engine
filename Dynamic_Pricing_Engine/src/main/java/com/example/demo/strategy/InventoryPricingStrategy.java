package com.example.demo.strategy;

import org.springframework.stereotype.Component;

@Component
public class InventoryPricingStrategy implements PricingStrategy {
  @Override
  public double calculate (double price,double value)
  {
	  return price+ (price*value/100);
  }
}
