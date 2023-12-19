package com.csc.api.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.csc.api.form.SelectForm;
import com.csc.api.mapper.UserMapper;

@Service
public class UserService {
	@Autowired
	private UserMapper userMapper;

	public void add(SelectForm form) {
		userMapper.select(form);
	}
	
}
