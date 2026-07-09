package com.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

@Entity
public class Product {
  @Id
  @GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;

  @NotBlank
  private String name;
  
  @NotNull
  private Double baseprice;
  public Product()
  {
	  
  }
  public Long getId() {
	return id;
  }
  public void setId(Long id) {
	this.id = id;
  }
  public String getName() {
	return name;
  }
  public void setName(String name) {
	this.name = name;
  }
  public Double getBaseprice() {
	return baseprice;
  }
  public void setBaseprice(Double baseprice) {
	this.baseprice = baseprice;
  }
  
  
}
