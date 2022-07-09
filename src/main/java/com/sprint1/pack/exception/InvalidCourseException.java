package com.sprint1.pack.exception;

public class InvalidCourseException extends Exception{
	public InvalidCourseException() {
		super();
	}
	public InvalidCourseException(String errorMsg) {
		super(errorMsg);
	}

}