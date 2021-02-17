package com.hcl.isgautomation.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

public class BusinessRules implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int id;
	private String country_name;
	private String nationality;
	private String hiring_country;
	private String host_country;
	private String assignment_duration;
	private Date doj;
	private String band;
	private String relavent_experience;
	private String departure_from_host_country;
	private String type_of_assignment;
	private Date visa_refusal_date;
	private String visa_refusal_reason;

	public BusinessRules() {
		
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCountry_name() {
		return country_name;
	}

	public void setCountry_name(String country_name) {
		this.country_name = country_name;
	}

	public String getNationality() {
		return nationality;
	}

	public void setNationality(String nationality) {
		this.nationality = nationality;
	}

	public String getHiring_country() {
		return hiring_country;
	}

	public void setHiring_country(String hiring_country) {
		this.hiring_country = hiring_country;
	}

	public String getHost_country() {
		return host_country;
	}

	public void setHost_country(String host_country) {
		this.host_country = host_country;
	}

	public String getAssignment_duration() {
		return assignment_duration;
	}

	public void setAssignment_duration(String assignment_duration) {
		this.assignment_duration = assignment_duration;
	}

	public Date getDoj() {
		return doj;
	}

	public void setDoj(Date doj) {
		this.doj = doj;
	}

	public String getBand() {
		return band;
	}

	public void setBand(String band) {
		this.band = band;
	}

	public String getRelavent_experience() {
		return relavent_experience;
	}

	public void setRelavent_experience(String relavent_experience) {
		this.relavent_experience = relavent_experience;
	}

	public String getDeparture_from_host_country() {
		return departure_from_host_country;
	}

	public void setDeparture_from_host_country(String departure_from_host_country) {
		this.departure_from_host_country = departure_from_host_country;
	}

	public String getType_of_assignment() {
		return type_of_assignment;
	}

	public void setType_of_assignment(String type_of_assignment) {
		this.type_of_assignment = type_of_assignment;
	}

	public Date getVisa_refusal_date() {
		return visa_refusal_date;
	}

	public void setVisa_refusal_date(Date visa_refusal_date) {
		this.visa_refusal_date = visa_refusal_date;
	}

	public String getVisa_refusal_reason() {
		return visa_refusal_reason;
	}

	public void setVisa_refusal_reason(String visa_refusal_reason) {
		this.visa_refusal_reason = visa_refusal_reason;
	}
	
}
