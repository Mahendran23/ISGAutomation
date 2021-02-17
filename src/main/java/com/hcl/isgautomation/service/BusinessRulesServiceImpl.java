package com.hcl.isgautomation.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hcl.isgautomation.dao.BusinessRulesDAO;
import com.hcl.isgautomation.entity.BusinessRules;

@Service
public class BusinessRulesServiceImpl implements BusinessRulesService {

	private BusinessRulesDAO businessRulesDAO;
	
	@Autowired
	public BusinessRulesServiceImpl(BusinessRulesDAO thebusinessRulesDAO) {
		businessRulesDAO = thebusinessRulesDAO;
	}
	
	@Override
	public List<BusinessRules> getAllBusinessRules() {
		return this.businessRulesDAO.getBusinessRules();
	}

	@Override
	public Object getAllBusinessRulesById(String countryName) {
		
		return this.businessRulesDAO.getBusinessRulesById(countryName);
	}

	@Override
	public void createBusinessRules(BusinessRules theBusinessRules) {
		 this.businessRulesDAO.createBusinessRules(theBusinessRules);;
	}

}
