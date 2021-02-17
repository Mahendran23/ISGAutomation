package com.hcl.isgautomation.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import com.hcl.isgautomation.entity.BusinessRules;
import com.hcl.isgautomation.entity.EmployeeInformation;
import com.hcl.isgautomation.exception.ResourceNotFoundException;

@Component
public class EmployeeInformationDAOImpl implements EmployeeInformationDAO{

	private static final Logger log = LoggerFactory.getLogger(EmployeeInformationDAOImpl.class);
	private JdbcTemplate jdbcTemplate;	
	private Object response;
	
	public EmployeeInformationDAOImpl(JdbcTemplate theJdbcTemplate) {
		jdbcTemplate = theJdbcTemplate;
	}

	@SuppressWarnings({ "unchecked", "deprecation" })
	@Override
	public Object getEmployeeInformationByID(int sapId) {

		String sql = "SELECT SAPID, NAME, EMAIL, DOJ, " 
				+ "PASSPORTEXPDATE, DOB, NATIONALITY, HIRING_COUNTRY, "
				+ "BAND, SUB_BAND, DESIGNATION, RELEVANT_EXPERIENCE "
				+ "FROM EMPLOYEEINFORMATION WHERE SAPID=?";
		
		EmployeeInformation empInfo = null;
		
		try {
			
			empInfo = (EmployeeInformation) jdbcTemplate.queryForObject(sql, new Object[]{sapId}, new RowMapper() {	
				
				@Override
				public Object mapRow(ResultSet rs, int rowNum) throws SQLException {
					
					EmployeeInformation empInfo = new EmployeeInformation();
					empInfo.setSapId(rs.getInt("SAPID"));					
					empInfo.setName(rs.getString("NAME"));
					empInfo.setEmail(rs.getString("EMAIL"));
					empInfo.setDoj(rs.getDate("DOJ"));
					empInfo.setPassportExpDate(rs.getDate("PASSPORTEXPDATE"));
					empInfo.setDob(rs.getDate("DOB"));
					empInfo.setNationality(rs.getString("NATIONALITY"));
					empInfo.setHiring_Country(rs.getString("HIRING_COUNTRY"));
					empInfo.setBand(rs.getString("BAND"));
					empInfo.setSubBand(rs.getString("SUB_BAND"));
					empInfo.setDesignation(rs.getString("DESIGNATION"));
					empInfo.setRelavent_experience(rs.getString("RELEVANT_EXPERIENCE"));
					return empInfo;
				}
				
			});
			response = empInfo;
			
		}catch(DataAccessException ex) {
			throw new ResourceNotFoundException("Employee Information for sapId " + sapId + " not Found");
		}
		return response;
		//return Optional.ofNullable(empInfo);
		
	}

	@SuppressWarnings("deprecation")
	@Override
	public String getEmployeeEmailByID(int sapId) {

		String sql = "SELECT EMAIL " 				
				+ "FROM EMPLOYEEINFORMATION WHERE SAPID=?";
		
		String email = (String) jdbcTemplate.queryForObject(
	            sql, new Object[] { sapId }, String.class);
		
		return email;
		
	}

	@Override
	public void updateEmployeeOTPByID(int sapId, int otp) {
		
		String sql = "UPDATE EMPLOYEEINFORMATION "
				+ "SET OTP = ? "
				+ "WHERE SAPID = ?";
		
		int update = jdbcTemplate.update(sql, otp, sapId);
		
		if(update == 1) {
			log.info("Employee " + sapId + " OTP Updated");
		}
	}

	@SuppressWarnings("deprecation")
	@Override
	public boolean validateEmployeeOTPByID(int sapId, int otp) {
		
		boolean response = false;
		
		String sql = "SELECT COUNT(*) " 				
				+ "FROM EMPLOYEEINFORMATION WHERE SAPID=? "
				+ " AND OTP=?";
		
		int count = jdbcTemplate.queryForObject(
	            sql, new Object[] { sapId, otp }, Integer.class);	
		
		if(count==1) {
			response = true;
		}
		
		return response;
	}

}
