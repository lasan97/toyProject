package com.toy.app.exception;

import lombok.Data;

@Data
public class CustomException extends Exception{

	  /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String message;
	  private String details;
	  private String hint;
	  private String nextActions;
	  private String support;
	  
	  public CustomException(
		      String message, String details) {
		    this.message = message;
		    this.details = details;
		  }
}
