package com.csc.api.form;

import java.io.Serializable;

import lombok.Data;

@Data
public class LoginForm implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	
	private String userName;
	private String pwd;
	

}
