package com.csc.api.entity;

import java.util.Date;
import lombok.*;

@Data

public class Employee {
	
	private int employeeId;
	private String employeeName;
	private String deptId;
	private Date employeeStartdate;
	private String genderTypeNo;
	private Date employeeBirthday;
	private String employeeTel;
	private String employeeAddress;
	private String employeeEmail;
	private String delFlg;
	private Date createDate;
	private String createUser;
	private Date updateDate;
	private String updateUser;


}
