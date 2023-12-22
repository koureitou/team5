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

	@NotBlank(message = "※名前漢字を入力してください")
	private String userName;
	private String pwd;
	

}
