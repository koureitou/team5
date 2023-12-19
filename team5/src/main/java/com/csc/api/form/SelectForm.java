package com.csc.api.form;

import java.io.Serializable;

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
	private String employeeStartdate;
	
	
	

}
