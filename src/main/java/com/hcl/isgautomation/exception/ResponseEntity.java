package com.hcl.isgautomation.exception;

public class ResponseEntity {

	private String error;
	
	public ResponseEntity() {
		
	}

	public ResponseEntity(String error) {
		this.error = error;
	}

	public String getError() {
		return error;
	}

	public void setError(String error) {
		this.error = error;
	}	
	
}
