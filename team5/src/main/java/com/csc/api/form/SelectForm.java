package com.csc.api.form;

import java.io.Serializable;
//import java.util.Date;

//import org.springframework.format.annotation.DateTimeFormat;

import lombok.Data;

@Data
public class SelectForm implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private Integer employeeId;
	private String employeeName;
	private String deptId;
	//@DateTimeFormat(pattern = "yyyy-MM-dd")
	private String employeeStartdate1;
	//@DateTimeFormat(pattern = "yyyy-MM-dd")
	private String employeeStartdate2;

}
