package com.csc.api.form;

import java.io.Serializable;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class LoginForm implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	//@NotBlank(message = "※パスワードは空に出来ません！")
	private Integer userId;
	@NotBlank(message = "※ユーザー名は空に出来ません！")
	private String userName;
	@NotBlank(message = "※パスワードは空に出来ません！")
	private String pwd;
	

}
