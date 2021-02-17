package com.hcl.isgautomation.dao;

import java.util.List;
import java.util.Optional;

public interface BusinessRulesDAO<BusinessRules>{
	
	public List<BusinessRules> getBusinessRules();
	
	public Object getBusinessRulesById(String countryName);
	
	public void createBusinessRules(BusinessRules theBusinessRules);

}
