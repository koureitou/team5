package com.csc.api.form;

import java.io.Serializable;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;
@Data
public class RegisterForm implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	private Integer employeeId;
	//@NotBlank(message = "※ユーザー名は空に出来ません！")
	private String employeeName;
	private String deptId;
	private String employeeStartdate;
	private String genderTypeNo;
	private String employeeBirthday;
	private String employeeTel;
	private String employeeAddress;
	private String employeeEmail;
}
