package com.csc.api.form;

import java.io.Serializable;

import lombok.Data;

@Data
public class RegisterUserForm implements Serializable {

	private static final long serialVersionUID = 1L;

	private Integer userId;
	private String userName;
	private String pwd;

}
