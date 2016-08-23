package com.moneysupermarket.programming.test;

/**
 * Class represents an invalid weight exception
 * @author mheyward
 *
 */
public class InvalidWeightException extends Exception {
	
	private static final long serialVersionUID = -5298899811233085132L;

	/**
	 * Default constructor
	 */
	public InvalidWeightException() {
		super();
	}

	/**
	 * Constructs an InvalidWeightException with message
	 * @param message
	 */
	public InvalidWeightException(String message) {
		super(message);
	}
	
	/**
	 * Constructs an InvalidWeightException with both message and cause
	 * @param message
	 * @param cause
	 */
	public InvalidWeightException(String message, Throwable cause) {
		super(message, cause);
	}
}
