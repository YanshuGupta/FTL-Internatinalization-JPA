package com.cg.exception;

public class EmptyRecordException extends Exception{

	public EmptyRecordException() {
		super();
	}
	
	public EmptyRecordException(String message) {
		super(message);
	}
}
