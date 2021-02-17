package com.isg.spring.dao;

import java.util.List;

import com.isg.spring.model.BusinessInformation;

public interface BusinessRuleDao {

	public List<BusinessInformation> getBusinessRules(String countryName);
}
