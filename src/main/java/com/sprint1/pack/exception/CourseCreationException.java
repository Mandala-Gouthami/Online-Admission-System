package com.sprint1.pack.exception;

public class CourseCreationException extends Exception{
	public CourseCreationException() {
		super();
	}
	public CourseCreationException(String errorMsg) {
		super(errorMsg);
	}

}
