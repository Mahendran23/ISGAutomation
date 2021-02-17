package com.isg.spring.model;

import java.io.Serializable;
import java.sql.Date;

public class BusinessInformation implements Serializable{

	public String getPassportExpiryDate() {
		return passportExpiryDate;
	}

	public void setPassportExpiryDate(String passportExpiryDate) {
		this.passportExpiryDate = passportExpiryDate;
	}

	public String getHiringCountry() {
		return hiringCountry;
	}

	public void setHiringCountry(String hiringCountry) {
		this.hiringCountry = hiringCountry;
	}

	public String getNationality() {
		return nationality;
	}

	public void setNationality(String nationality) {
		this.nationality = nationality;
	}

	public String getCountryToTravel() {
		return countryToTravel;
	}

	public void setCountryToTravel(String countryToTravel) {
		this.countryToTravel = countryToTravel;
	}

	public String getDurationofAssignment() {
		return durationofAssignment;
	}

	public void setDurationofAssignment(String durationofAssignment) {
		this.durationofAssignment = durationofAssignment;
	}

	public Date getdOJ() {
		return dOJ;
	}

	public void setdOJ(Date dOJ) {
		this.dOJ = dOJ;
	}

	public boolean isDependentAccompanyToTravel() {
		return isDependentAccompanyToTravel;
	}

	public void setDependentAccompanyToTravel(boolean isDependentAccompanyToTravel) {
		this.isDependentAccompanyToTravel = isDependentAccompanyToTravel;
	}

	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
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

	public String getRelevantExperience() {
		return relevantExperience;
	}

	public void setRelevantExperience(String relevantExperience) {
		this.relevantExperience = relevantExperience;
	}

	public boolean isTravelToHostCountry() {
		return isTravelToHostCountry;
	}

	public void setTravelToHostCountry(boolean isTravelToHostCountry) {
		this.isTravelToHostCountry = isTravelToHostCountry;
	}

	public String getDepartureFromHostCountry() {
		return departureFromHostCountry;
	}

	public void setDepartureFromHostCountry(String departureFromHostCountry) {
		this.departureFromHostCountry = departureFromHostCountry;
	}

	public String getTypeOfAssignment() {
		return typeOfAssignment;
	}

	public void setTypeOfAssignment(String typeOfAssignment) {
		this.typeOfAssignment = typeOfAssignment;
	}

	public boolean isAnyVisaRefusals() {
		return isAnyVisaRefusals;
	}

	public void setAnyVisaRefusals(boolean isAnyVisaRefusals) {
		this.isAnyVisaRefusals = isAnyVisaRefusals;
	}

	public String getDateOfRejection() {
		return dateOfRejection;
	}

	public void setDateOfRejection(String dateOfRejection) {
		this.dateOfRejection = dateOfRejection;
	}

	public String getReasonForRejection() {
		return reasonForRejection;
	}

	public void setReasonForRejection(String reasonForRejection) {
		this.reasonForRejection = reasonForRejection;
	}

	private String passportExpiryDate;
	private String hiringCountry;
	private String nationality;
	private String countryToTravel;
	private String durationofAssignment;
	private Date dOJ;
	private boolean isDependentAccompanyToTravel;
	private Date dateOfBirth;
	private String band;
	private String subBand;
	private String relevantExperience;
	private boolean isTravelToHostCountry;
	private String departureFromHostCountry;
	private String typeOfAssignment;
	private boolean isAnyVisaRefusals;
	private String dateOfRejection;
	private String reasonForRejection;
	
	public BusinessInformation() {
		// TODO Auto-generated constructor stub
	}
	
}
