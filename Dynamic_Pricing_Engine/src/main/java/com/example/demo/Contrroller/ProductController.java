package com.example.demo.Contrroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Product;
import com.example.demo.service.ProductService;


@RestController
@RequestMapping("/products")
public class ProductController {
   @Autowired
   private ProductService productservice;
   
   @PostMapping
   public Product save(@RequestBody Product product)
   {
	   System.out.println("Name:"+ product.getName());
	   System.out.println("baseprice:" + product.getBaseprice());
	   return productservice.save(product);
   }
   @GetMapping
   public List<Product>getAll()
   {
	   return productservice.getAll();
   }
}
