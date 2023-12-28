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
	@NotBlank(message = "※社員名前は空に出来ません！")
	private String employeeName;
	@NotBlank(message = "※所属は空に出来ません！")
	private String deptId;
	@NotBlank(message = "※入社時期は空に出来ません！")
	private String employeeStartdate;
	@NotBlank(message = "※性別は空に出来ません！")
	private String genderTypeNo;
	private String employeeBirthday;
	private String employeeTel;
	private String employeeAddress;
	private String employeeEmail;
}
