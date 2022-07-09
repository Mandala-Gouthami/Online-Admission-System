package com.sprint1.pack;

import java.time.LocalDate;
import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import com.sprint1.pack.exception.CourseCreationException;
import com.sprint1.pack.exception.ErrorMessage;
import com.sprint1.pack.exception.InvalidCourseException;



@ControllerAdvice
public class GlobalExceptionHandler {
	/*
	 *  1
	 *  2
	 *  client send request 
	 * 
	 */

	@ExceptionHandler(InvalidCourseException.class)
	public @ResponseBody ErrorMessage checkInvalidBookException(InvalidCourseException e)
	
	{
		ErrorMessage error1=new ErrorMessage(LocalDateTime.now(), e.getMessage());
		return error1;
	}
	@ExceptionHandler(CourseCreationException.class)
	public @ResponseBody ErrorMessage checkBookCreationException(CourseCreationException e)
	
	{
		ErrorMessage error1=new ErrorMessage(LocalDateTime.now(), e.getMessage());
		return error1;
	}
	
	/*@ExceptionHandler(InvalidLoginException.class)
	public ResponseEntity<Object> checkInvalidLogin(InvalidLoginException e)
	{
		
		ErrorMessage responseError=new ErrorMessage(LocalDateTime.now(), e.getMessage());
		ResponseEntity< Object> res=new ResponseEntity<Object>(responseError, HttpStatus.BAD_REQUEST);
		return res;
		
	}*/
	//validation
	
	@ExceptionHandler(MethodArgumentNotValidException.class)
	public @ResponseBody ErrorMessage checkCourseValidation(MethodArgumentNotValidException e)
	
	{
		ErrorMessage error1=new ErrorMessage(LocalDateTime.now(), e.getMessage(),e.getBindingResult().toString());
		return error1;
	}
	
	
	
	
		 
	}
