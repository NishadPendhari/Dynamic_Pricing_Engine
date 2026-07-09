package com.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class PricingRule {
	 @Id
	  @GeneratedValue(strategy=GenerationType.IDENTITY)
		private Long id;
	 
	 private String type;
	 private Double ruleValue;
	 private String ruleCondition;
	 
	 public PricingRule()
	 {
		 
	 }
	 public Long getId() {
		 return id;
	 }
	 public void setId(Long id) {
		 this.id = id;
	 }
	 public String getType() {
		 return type;
	 }
	 public void setType(String type) {
		 this.type = type;
	 }
	 public Double getRuleValue() {
		 return ruleValue;
	 }
	 public void setRuleValue(Double ruleValue) {
		 this.ruleValue = ruleValue;
	 }
	 public String getRuleCondition() {
		 return ruleCondition;
	 }
	 public void setRuleCondition(String ruleCondition) {
		 this.ruleCondition = ruleCondition;
	 }
	 
	 
}
