package com.hcl.isgautomation.service;

public interface MailService {

	public void sendMail(Integer sapId);
	
	public int generateOTP();
	
	public void saveOTP(Integer sapId, int otp);
	
	public boolean validateOTP(Integer sapId, int otp); 
}
