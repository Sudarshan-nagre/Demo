package com.demo.exception;

public class InvalidAgeException extends RuntimeException{

	String msg;

	public InvalidAgeException(String msg) {
		super(msg);
		this.msg = msg;
	}
}
