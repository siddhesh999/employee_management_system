package com.tyss.ems.exceptionhandller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import com.tyss.ems.customeexception.EmployeeCoustomeException;
import com.tyss.ems.response.Response;

public class ExceptionHandler {

	@org.springframework.web.bind.annotation.ExceptionHandler(EmployeeCoustomeException.class)
	public ResponseEntity<Response> exceptionhandler(EmployeeCoustomeException exception) {
		return new ResponseEntity<Response>(new Response(true, exception.getMessage(), null), HttpStatus.BAD_REQUEST);
	}

}
