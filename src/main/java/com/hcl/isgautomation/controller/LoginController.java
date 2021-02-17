package com.hcl.isgautomation.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.view.RedirectView;

import com.hcl.isgautomation.exception.ResourceNotFoundException;
import com.hcl.isgautomation.service.MailService;

@RestController
@RequestMapping("/login")
public class LoginController {
	
	public MailService mailService;	

	public LoginController(MailService mailService) {
		this.mailService = mailService;
	}

	@GetMapping("/{sapId}")
	public void sendMailForOTP(@PathVariable Integer sapId) {
		mailService.sendMail(sapId);
	}
	
	@GetMapping("/{sapId}/{otp}")
	public RedirectView validateOTP(@PathVariable Integer sapId, @PathVariable Integer otp) {
		
		if(mailService.validateOTP(sapId, otp)) {
			return new RedirectView("/employeeInformation/{sapId}");
		}else {
			return new RedirectView("/error");
		}
		
	}
	
	@GetMapping("/error")
	public Object returnLoginError() {
		throw new ResourceNotFoundException("Login Denied");
	}
	
}
