package com.sac.demo.custom.exceptions;

public class ServiceExceptions extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String erroCode;
	private String errorMessage;

	public ServiceExceptions(String erroCode, String errorMessage) {
		super();
		this.erroCode = erroCode;
		this.errorMessage = errorMessage;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public ServiceExceptions() {

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

}
