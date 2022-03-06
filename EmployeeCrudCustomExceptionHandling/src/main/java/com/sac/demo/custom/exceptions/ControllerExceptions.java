package com.sac.demo.custom.exceptions;

public class ControllerExceptions extends RuntimeException{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String erroCode;
	private String errorMessage;
	
	public ControllerExceptions() {
		
	}
	
	public ControllerExceptions(String erroCode, String errorMessage) {
		super();
		this.erroCode = erroCode;
		this.errorMessage = errorMessage;
	}

	public String getErroCode() {
		return erroCode;
	}
	public void setErroCode(String erroCode) {
		this.erroCode = erroCode;
	}
	public String getErrorMessage() {
		return errorMessage;
	}
	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
}
