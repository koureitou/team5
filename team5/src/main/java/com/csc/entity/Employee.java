package com.csc.entity;

import java.util.Date;
import lombok.*;

@Data
public class Employee {
	
	private int employeeID;
	private String employeeName;
	private String deptID;
	private Date employeeSrtdate;
	private String genderTypeNo;
	private Date employeeBirthday;
	private String employeeTel;
	private String employeeAddress;
	private String employeeEmail;
	private String del_flg;
	private Date createDate;
	private String createUser;
	private Date updateDate;
	private String updateUser;


}
