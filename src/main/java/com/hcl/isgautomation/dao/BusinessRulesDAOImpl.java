package com.hcl.isgautomation.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import com.hcl.isgautomation.entity.BusinessRules;
import com.hcl.isgautomation.exception.ResourceNotFoundException;

@Component
public class BusinessRulesDAOImpl implements BusinessRulesDAO<BusinessRules> {

	private static final Logger log = LoggerFactory.getLogger(BusinessRulesDAOImpl.class);
	private JdbcTemplate jdbcTemplate;	
	private Object response;	
	
	public BusinessRulesDAOImpl(JdbcTemplate theJdbcTemplate) {
		jdbcTemplate = theJdbcTemplate;		
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public List<BusinessRules> getBusinessRules() {

		String sql = "SELECT ID, COUNTRY_NAME, NATIONALITY, HIRING_COUNTRY, HOST_COUNTRY "
				+ " , ASSIGNMENT_DURATION, DOJ, BAND, RELEVANT_EXPERIENCE "
				+ " , DEPARTURE_FROM_HOST_COUNTRY, TYPE_OF_ASSIGNMENT, VISA_REFUSAL_DATE "
				+ "	, VISA_REFUSAL_REASON FROM BUSINESSRULES ";
		
		return jdbcTemplate.query(sql, new RowMapper() {

			@Override
			public Object mapRow(ResultSet rs, int rowNum) throws SQLException {
				BusinessRules br = new BusinessRules();
				br.setId(rs.getInt("ID"));
				br.setCountry_name(rs.getString("COUNTRY_NAME"));
				br.setNationality(rs.getString("NATIONALITY"));
				br.setHiring_country(rs.getString("HIRING_COUNTRY"));
				br.setHost_country(rs.getString("HOST_COUNTRY"));
				br.setAssignment_duration(rs.getString("ASSIGNMENT_DURATION"));
				br.setDoj(rs.getDate("DOJ"));
				br.setBand(rs.getString("BAND"));
				br.setRelavent_experience(rs.getString("RELEVANT_EXPERIENCE"));
				br.setDeparture_from_host_country(rs.getString("DEPARTURE_FROM_HOST_COUNTRY"));
				br.setType_of_assignment(rs.getString("TYPE_OF_ASSIGNMENT"));
				br.setVisa_refusal_date(rs.getDate("VISA_REFUSAL_DATE"));
				br.setVisa_refusal_reason(rs.getString("VISA_REFUSAL_REASON"));
				
				return br;
			}
		});
	}		

	@SuppressWarnings({ "unchecked", "deprecation" })
	@Override
	public Object getBusinessRulesById(String countryName) {
		
		String sql = "SELECT ID, COUNTRY_NAME, NATIONALITY, HIRING_COUNTRY, HOST_COUNTRY "
				+ " , ASSIGNMENT_DURATION, DOJ, BAND, RELEVANT_EXPERIENCE "
				+ " , DEPARTURE_FROM_HOST_COUNTRY, TYPE_OF_ASSIGNMENT, VISA_REFUSAL_DATE "
				+ "	, VISA_REFUSAL_REASON FROM BUSINESSRULES WHERE COUNTRY_NAME=?";

		BusinessRules businessRules = null;
		
		try {
			businessRules = (BusinessRules) jdbcTemplate.queryForObject(sql, new Object[]{countryName}, new RowMapper() {	
				
				@Override
				public Object mapRow(ResultSet rs, int rowNum) throws SQLException {
					
					BusinessRules br = new BusinessRules();
					br.setId(rs.getInt("ID"));
					br.setCountry_name(rs.getString("COUNTRY_NAME"));
					br.setNationality(rs.getString("NATIONALITY"));
					br.setHiring_country(rs.getString("HIRING_COUNTRY"));
					br.setHost_country(rs.getString("HOST_COUNTRY"));
					br.setAssignment_duration(rs.getString("ASSIGNMENT_DURATION"));
					br.setDoj(rs.getDate("DOJ"));
					br.setBand(rs.getString("BAND"));
					br.setRelavent_experience(rs.getString("RELEVANT_EXPERIENCE"));
					br.setDeparture_from_host_country(rs.getString("DEPARTURE_FROM_HOST_COUNTRY"));
					br.setType_of_assignment(rs.getString("TYPE_OF_ASSIGNMENT"));
					br.setVisa_refusal_date(rs.getDate("VISA_REFUSAL_DATE"));
					br.setVisa_refusal_reason(rs.getString("VISA_REFUSAL_REASON"));
					
					return br;
				}
				
			});	
			response = businessRules;
		}catch(DataAccessException ex) {
			throw new ResourceNotFoundException("Business Rules not found for " + countryName);
		}
		
		return response;
	}

	@Override
	public void createBusinessRules(BusinessRules theBusinessRules) {
		String sql = "INSERT INTO BUSINESSRULES(ID,COUNTRY_NAME,NATIONALITY,HIRING_COUNTRY"
				+ ",HOST_COUNTRY,ASSIGNMENT_DURATION,DOJ,BAND,RELEVANT_EXPERIENCE"
				+ ",DEPARTURE_FROM_HOST_COUNTRY,TYPE_OF_ASSIGNMENT,VISA_REFUSAL_DATE"
				+ ",VISA_REFUSAL_REASON" + ")" + " VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?)";
		
		jdbcTemplate.update(sql, theBusinessRules.getId(), theBusinessRules.getCountry_name(), 
				theBusinessRules.getNationality(), theBusinessRules.getHiring_country(),
				theBusinessRules.getHost_country(), theBusinessRules.getAssignment_duration(),
				theBusinessRules.getDoj(), theBusinessRules.getBand(), theBusinessRules.getRelavent_experience(),
				theBusinessRules.getDeparture_from_host_country(), theBusinessRules.getType_of_assignment(),
				theBusinessRules.getVisa_refusal_date(), theBusinessRules.getVisa_refusal_reason());		
	}

}
