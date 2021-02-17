package com.hcl.isgautomation.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hcl.isgautomation.service.EmployeeInformationService;
import com.hcl.isgautomation.service.MailService;

@RestController
@RequestMapping("/employeeInformation")
//@CrossOrigin(origins = "http://localhost:4200")
public class EmployeeInformationController {
	
	private EmployeeInformationService employeeInformationService;
	
	public EmployeeInformationController(EmployeeInformationService theEmployeeInformationService) {
		employeeInformationService = theEmployeeInformationService;
	}

	@GetMapping("/{sapId}")
	public Object getEmployeeInformationById(@PathVariable Integer sapId){
		return employeeInformationService.getEmployeeInformationById(sapId);
		
	}		
	
}
