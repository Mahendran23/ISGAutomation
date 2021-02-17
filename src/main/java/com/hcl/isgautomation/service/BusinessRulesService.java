package com.hcl.isgautomation.service;

import java.util.List;
import java.util.Optional;

import com.hcl.isgautomation.entity.BusinessRules;

public interface BusinessRulesService {

	public List<BusinessRules> getAllBusinessRules();
	
	public Object getAllBusinessRulesById(String countryName);
	
	public void createBusinessRules(BusinessRules theBusinessRules);
}
