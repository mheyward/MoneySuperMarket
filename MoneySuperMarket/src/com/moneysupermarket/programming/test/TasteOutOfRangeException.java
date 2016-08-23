package com.moneysupermarket.programming.test;

public class TasteOutOfRangeException extends Exception {
	
	private static final long serialVersionUID = -831537514197998001L;

	public TasteOutOfRangeException() {
		super();
	}
	
	public TasteOutOfRangeException(String message) {
		super(message);
	}
	
	public TasteOutOfRangeException(String message, Throwable cause) {
		super(message, cause);
	}
	
}
