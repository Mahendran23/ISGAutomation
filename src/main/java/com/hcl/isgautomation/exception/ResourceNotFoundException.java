package com.hcl.isgautomation.exception;

public class ResourceNotFoundException extends RuntimeException{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String message;

	public ResourceNotFoundException() {
		
	}
	
	public ResourceNotFoundException(String message) {	
		this.message = message;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
}
