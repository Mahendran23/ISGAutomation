package com.isg.spring.utility;

import com.isg.spring.model.BusinessInformation;
import com.isg.spring.model.ValidationResult;

public class RuleValidatorUtility {

	public RuleValidatorUtility() {
		// TODO Auto-generated constructor stub
	}

	public ValidationResult checkBusinessValidation(BusinessInformation employeeBusinessInformation,BusinessInformation countryConfiguration)
	{
		ValidationResult validationResult = null;
		
		if(employeeBusinessInformation.getPassportExpiryDate() != null)
		{
			
		}
		
		return new ValidationResult();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
