package com.moneysupermarket.programming.test;

/**
 * Class represents a taste out of range exception
 * @author mheyward
 *
 */
public class TasteOutOfRangeException extends Exception {
	
	private static final long serialVersionUID = -831537514197998001L;

	/**
	 * Default constructor
	 */
	public TasteOutOfRangeException() {
		super();
	}
	
	/**
	 * Constructs a TasteOutOfRangeException with message
	 * @param message
	 */
	public TasteOutOfRangeException(String message) {
		super(message);
	}
	
	/**
	 * Constructs a TasteOutOfRangeException with both message and cause
	 * @param message
	 * @param cause
	 */
	public TasteOutOfRangeException(String message, Throwable cause) {
		super(message, cause);
	}
	
}
