package com.gsrk.spring.boot.start.exception;

public class TopicNotFoundException extends RuntimeException{

	/**
	 * 
	 */
	private static final long serialVersionUID = -3923720657593581079L;
	
	public TopicNotFoundException(String message){
		super(message);
	}

}
