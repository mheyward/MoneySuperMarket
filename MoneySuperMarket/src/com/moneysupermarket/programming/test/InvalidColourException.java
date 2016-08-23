package com.moneysupermarket.programming.test;

public class InvalidColourException extends Exception {
	
	private static final long serialVersionUID = -2146101711307345801L;

	/**
	 * Default constructor
	 */
	public InvalidColourException() {
		super();
	}

	/**
	 * Constructs an InvalidColourException with message
	 * @param message
	 */
	public InvalidColourException(String message) {
		super(message);
	}
	
	/**
	 * Constructs an InvalidColourException with both message and cause
	 * @param message
	 * @param cause
	 */
	public InvalidColourException(String message, Throwable cause) {
		super(message, cause);
	}

}
