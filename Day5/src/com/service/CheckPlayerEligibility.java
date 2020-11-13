package com.service;

/**
 * 
 * @author HanumanL
 * 
 * 
 *
 */
public class CheckPlayerEligibility extends Exception {

	private String errorMessage;

	public String getErrorMessage() {
		return errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

	public CheckPlayerEligibility(String errorMessage) {
		this.errorMessage = errorMessage;
	}
}
