package com.csc.api.entity;

import java.util.Date;
import lombok.Data;
@Data

public class Dept {
	
		private String deptId;
		private String deptName; 
		private Date createDate;
		private String createUser;
		private Date updateDate;
		private String updateUser;
}
