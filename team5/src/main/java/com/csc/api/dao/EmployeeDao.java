package com.csc.api.dao;

import java.util.List;

import org.springframework.ui.Model;

import com.csc.api.entity.Employee;

public interface EmployeeDao {
	List<Employee> findAll();
	List<Employee> updateAll();
	List<Employee> addAll();
	void deleteById(int employeeId);
	//List<Employee> selectById(int employeeId);
	List<Employee> selectById(int employeeId, Model model);
	//List<Employee> selectById(int employeeId);
}