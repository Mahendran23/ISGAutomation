package com.hcl.isgautomation.controller;

import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hcl.isgautomation.entity.BusinessRules;
import com.hcl.isgautomation.service.BusinessRulesService;

@RestController
@RequestMapping("/businessRules")
//@CrossOrigin(origins = "http://localhost:4200")
public class BusinessRulesController {
	
	private BusinessRulesService businessRulesService;
	
	public BusinessRulesController(BusinessRulesService theBusinessRulesService) {
		businessRulesService = theBusinessRulesService;
	}
	
	@GetMapping
	public List<BusinessRules> getAllEmpBusinessInfo(){
		return businessRulesService.getAllBusinessRules();
	}
	
	@GetMapping("/{countryName}")
	public Object getAllEmpBusinessInfoById(@PathVariable String countryName){
		return businessRulesService.getAllBusinessRulesById(countryName);
	}

	@PostMapping
	public void createBusinessRules(@RequestBody BusinessRules businessRules){
		 businessRulesService.createBusinessRules(businessRules);
	} 
}
