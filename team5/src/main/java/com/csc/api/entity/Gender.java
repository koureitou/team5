package com.csc.api.entity;

import java.util.Date;

import lombok.Data;
@Data
public class Gender {
	private String genderTypeNo;
	private String genderType;
	private Date createDate;
	private String createUser;
	private Date updateDate;
	private String updateUser;
}
