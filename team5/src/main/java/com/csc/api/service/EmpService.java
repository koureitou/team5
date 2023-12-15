package com.csc.api.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.csc.api.form.RegisterForm;
import com.csc.api.mapper.EmpMapper;

@Service
public class EmpService {
	@Autowired
	private EmpMapper empMapper;

	public void add(RegisterForm form) {
		empMapper.insert(form);
	}
	public Integer getEmpMaxId() {
		return empMapper.getMaxId();
	}
}
