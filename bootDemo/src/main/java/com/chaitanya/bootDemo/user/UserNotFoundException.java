package com.chaitanya.bootDemo.user;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class UserNotFoundException extends RuntimeException {

	public UserNotFoundException(String messg) {
		super(messg);
		// TODO Auto-generated constructor stub
	}

	
}
