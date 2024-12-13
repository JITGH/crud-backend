package com.ghosh.crud.exception;

public class UserNotFoundException extends RuntimeException{

	public UserNotFoundException(Long id) {
		super("Could not Found the user with id");
	}
}
