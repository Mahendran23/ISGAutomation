package com.hcl.isgautomation.dao;

public interface EmployeeInformationDAO {

	public Object getEmployeeInformationByID(int sapId);
	
	public String getEmployeeEmailByID(int sapId);
	
	public void updateEmployeeOTPByID(int sapId, int otp);
	
	public boolean validateEmployeeOTPByID(int sapId, int otp);
	
}
