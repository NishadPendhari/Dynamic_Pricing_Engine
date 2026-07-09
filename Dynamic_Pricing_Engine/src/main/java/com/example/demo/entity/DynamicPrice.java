package com.example.demo.entity;

import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class DynamicPrice {
	 @Id
	  @GeneratedValue(strategy=GenerationType.IDENTITY)
		private Long id;
	 
	 @ManyToOne
	 @JoinColumn(name="product_id")
	 private Product product;
	 private Double finalPrice;
	 private LocalDateTime createdAt;
	 public Long getId() {
		 return id;
	 }
	 public void setId(Long id) {
		 this.id = id;
	 }
	 public Product getProduct() {
		 return product;
	 }
	 public void setProduct(Product product) {
		 this.product = product;
	 }
	 public Double getFinalPrice() {
		 return finalPrice;
	 }
	 public void setFinalPrice(Double finalPrice) {
		 this.finalPrice = finalPrice;
	 }
	 public LocalDateTime getCreatedAt() {
		 return createdAt;
	 }
	 public void setCreatedAt(LocalDateTime createdAt) {
		 this.createdAt = createdAt;
	 }
	 
	 
}
