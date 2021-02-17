package com.hcl.isgautomation.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.hcl.isgautomation.dao.EmployeeInformationDAO;

@Service
public class EmployeeInformationServiceImpl implements EmployeeInformationService {

	private EmployeeInformationDAO employeeInformationDAO;
	
	public EmployeeInformationServiceImpl(EmployeeInformationDAO theEmployeeInformationDAO) {
		employeeInformationDAO = theEmployeeInformationDAO;
	}

	@Override
	public Object getEmployeeInformationById(int sapId) {
		// TODO Auto-generated method stub
		return this.employeeInformationDAO.getEmployeeInformationByID(sapId);
	}

}
