package com.wjc.model;

/**
 * Encapsulates a response error
 * @author jiechao
 */
public final class ResponseError {
	
	private int errorCode;
	private String errorMessage;

	public ResponseError() {
	}

	public ResponseError(int errorCode, String errorMessage) {
		this.errorCode = errorCode;
		this.errorMessage = errorMessage;
	}

	public int getErrorCode() {
		return errorCode;
	}

	public void setErrorCode(int errorCode) {
		this.errorCode = errorCode;
	}

	public String getErrorMessage() {
		return errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}
}
