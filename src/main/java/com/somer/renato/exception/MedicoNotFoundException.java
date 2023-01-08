package com.somer.renato.exception;


// exeção caso entidade medico nao exista pelo id
public class MedicoNotFoundException extends Exception {


	private static final long serialVersionUID = 1L;

	public MedicoNotFoundException() {
		super();
		
	}

	public MedicoNotFoundException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
		
	}

	public MedicoNotFoundException(String message, Throwable cause) {
		super(message, cause);
		
	}

	public MedicoNotFoundException(String message) {
		super(message);
		
	}

	public MedicoNotFoundException(Throwable cause) {
		super(cause);
		
	}

	
	
}
