package com.csc.dao.impl;

import java.util.List;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.csc.dao.EmployeeDao;
import com.csc.entity.Employee;

@Repository
public class EmployeeDaoImpl implements EmployeeDao {
	
	private JdbcTemplate jdbctemplate;

	@Override
	public List<Employee> findAll() {
		String sql="select * from T_EMPLOYEE";
		RowMapper<Employee> rowMapper=new BeanPropertyRowMapper<Employee>(Employee.class);
		
		return this.jdbctemplate.query(sql, rowMapper);
	}

	@Override
	public List<Employee> updateAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Employee> deleteAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Employee> addAll() {
		
		return null;
	}

}