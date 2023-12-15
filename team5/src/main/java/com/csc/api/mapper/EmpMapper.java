package com.csc.api.mapper;

import com.csc.api.form.RegisterForm;

public interface EmpMapper {
	Integer insert(RegisterForm form);
	Integer getMaxId();
}
