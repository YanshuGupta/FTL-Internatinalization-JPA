package com.cg.exception;

public class IdAlreadyExists extends Exception {

	public IdAlreadyExists() {
		super();
	}
	
	public IdAlreadyExists(String message) {
		super(message);
	}
}
