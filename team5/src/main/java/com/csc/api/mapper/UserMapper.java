package com.csc.api.mapper;

import java.util.List;

import com.csc.api.entity.Employee;
import com.csc.api.entity.User;

import com.csc.api.form.SelectForm;

public interface UserMapper {

	List<Employee> findAll();

	List<Employee> findByKeyword(SelectForm selectForm);

	void delById(List<Long> ids);
	
	User findByUsername(String userName);

}
