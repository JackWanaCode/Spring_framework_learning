package com.appdevelopmentblog.app.ws.exceptions;

public class UserServiceException extends RuntimeException {

	private static final long serialVersionUID = 7012140247839344314L;

	public UserServiceException(String message) {
		super(message);
	}
}
