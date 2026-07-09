package com.example.demo.Contrroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.PricingRule;
import com.example.demo.repository.PricingRuleRepository;


@RestController
@RequestMapping("/rules")
public class PricingRuleController {

	@Autowired
	private PricingRuleRepository pricingrulerepository;
	
	@PostMapping
	public PricingRule save(@RequestBody PricingRule rule)
	{
		return pricingrulerepository.save(rule);
	}
	@GetMapping
	public List<PricingRule>getAll()
	{
		return pricingrulerepository.findAll();
	}
}
