package com.isg.spring.model;

import java.io.Serializable;

public class ValidationResult implements Serializable{

	private boolean isValid;
	public boolean isValid() {
		return isValid;
	}

	public void setValid(boolean isValid) {
		this.isValid = isValid;
	}

	public String getErrorMessage() {
		return errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

	private String errorMessage;
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public ValidationResult() {
		// TODO Auto-generated constructor stub
	}

}
