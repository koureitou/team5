package com.csc.api.dao;

import java.util.List;

import com.csc.api.entity.Employee;

public interface EmployeeDao {
	List<Employee> findAll();
	List<Employee> updateAll();
	List<Employee> deleteAll();
	List<Employee> addAll();
}