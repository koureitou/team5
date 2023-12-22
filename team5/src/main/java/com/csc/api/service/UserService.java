package com.csc.api.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.csc.api.entity.Employee;


import com.csc.api.form.RegisterUserForm;
import com.csc.api.form.SelectForm;

import com.csc.api.mapper.UserMapper;

@Service
public class UserService {
	@Autowired
	private UserMapper userMapper;
	public UserService(UserMapper userMapper) {
        this.userMapper = userMapper;
    }

	public List<Employee> findAll() {
		return userMapper.findAll();
	}

	public List<Employee> findByKeyword(SelectForm selectForm) {
		return userMapper.findByKeyword(selectForm);
	}

	public void delById(List<Long> ids) {

		userMapper.delById(ids);
	}
	
	
	public Integer getUserMaxId() {
		return userMapper.getUserMaxId();

	}
	
	public void insertUser(RegisterUserForm registerUserForm) {
		userMapper.insertUser(registerUserForm);
	}

	

}
