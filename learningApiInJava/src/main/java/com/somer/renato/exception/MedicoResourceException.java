package com.somer.renato.exception;

public class MedicoResourceException extends Exception{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public MedicoResourceException() {
		super();
		
	}

	public MedicoResourceException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
		
	}

	public MedicoResourceException(String message, Throwable cause) {
		super(message, cause);
		
	}

	public MedicoResourceException(String message) {
		super(message);
		
	}

	public MedicoResourceException(Throwable cause) {
		super(cause);
		
	}

	
	
}
