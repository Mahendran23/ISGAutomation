package com.hcl.isgautomation.entity;

import java.io.Serializable;
import java.util.Date;

public class EmployeeInformation implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	// Serialize
	private int sapId;
	private String name;
	private String email;
	private Date doj;
	private Date passportExpDate;
	private Date dob;
	private String nationality;
	private String hiring_Country;
	private String band;
	private String subBand;
	private String designation;
	private String relavent_experience;
	
	public EmployeeInformation() {
		
	}
	
	public int getSapId() {
		return sapId;
	}
	public void setSapId(int sapId) {
		this.sapId = sapId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Date getDoj() {
		return doj;
	}
	public void setDoj(Date doj) {
		this.doj = doj;
	}
	public Date getPassportExpDate() {
		return passportExpDate;
	}
	public void setPassportExpDate(Date passportExpDate) {
		this.passportExpDate = passportExpDate;
	}
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	public String getNationality() {
		return nationality;
	}
	public void setNationality(String nationality) {
		this.nationality = nationality;
	}
	public String getHiring_Country() {
		return hiring_Country;
	}
	public void setHiring_Country(String hiring_Country) {
		this.hiring_Country = hiring_Country;
	}
	public String getBand() {
		return band;
	}
	public void setBand(String band) {
		this.band = band;
	}
	public String getSubBand() {
		return subBand;
	}
	public void setSubBand(String subBand) {
		this.subBand = subBand;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public String getRelavent_experience() {
		return relavent_experience;
	}
	public void setRelavent_experience(String relavent_experience) {
		this.relavent_experience = relavent_experience;
	}
	
}
