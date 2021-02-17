package com.hcl.isgautomation.service;

import java.util.Properties;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

import org.springframework.stereotype.Service;

import com.hcl.isgautomation.dao.EmployeeInformationDAO;

@Service
public class MailServiceImpl implements MailService{
	
	private EmployeeInformationDAO employeeInformationDAO;
	
	public MailServiceImpl(EmployeeInformationDAO theEmployeeInformationDAO) {
		employeeInformationDAO = theEmployeeInformationDAO;
	}
	
	@Override
	public void sendMail(Integer sapId) {
		
		String from = "hemnath.nagarajan@hcl.com";
		String to = employeeInformationDAO.getEmployeeEmailByID(sapId);
	/*	
		Properties props = new Properties();
		
		props.put("mail.smtp.auth", "false");
	    props.put("mail.smtp.starttls.enable", "false");
	    props.put("mail.smtp.host", "smtp.hcl.com");
	    props.put("mail.smtp.port", "587");
		
	    Session session = Session.getInstance(props);
	    */
	  //  try {
	    	int otp = generateOTP();
	    	saveOTP(sapId,otp);
	 /*   	MimeMessage message = new MimeMessage(session);
	    	message.setFrom(new InternetAddress(from));
	    	message.addRecipient(Message.RecipientType.TO, new InternetAddress(to));
	    	message.setSubject("ISG Automation - OTP");
	    	message.setText("Enter OTP: " + otp);
	    	Transport.send(message);*/
	    	//System.out.println("MailSent");
	    	
	    /*}catch(MessagingException ex) {
	    	ex.printStackTrace();
	    }*/
	}

	@Override
	public int generateOTP() {
		
		  int lowerLimit = 1001; 
		  int upperLimit = 9999;
	      int otp = (int) (Math.random() * upperLimit);
	      if (otp < lowerLimit)
	      {
	         otp += lowerLimit;
	      }
	      return otp;
	}

	@Override
	public void saveOTP(Integer sapId, int otp) {
		employeeInformationDAO.updateEmployeeOTPByID(sapId, otp);
	}

	@Override
	public boolean validateOTP(Integer sapId, int otp) {
		
		return employeeInformationDAO.validateEmployeeOTPByID(sapId, otp);
	}

}
