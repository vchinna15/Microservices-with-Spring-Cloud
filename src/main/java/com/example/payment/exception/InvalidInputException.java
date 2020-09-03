package com.example.payment.exception;

public class InvalidInputException extends RuntimeException{

private String message;

public String getMessage() {
	return message;
}

public void setMessage(String message) {
	this.message = message;
}

public InvalidInputException (String message) {
	this.message=message;
}
}
