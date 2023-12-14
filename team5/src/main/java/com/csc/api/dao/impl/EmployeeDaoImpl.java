package com.csc.api.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.csc.api.dao.EmployeeDao;
import com.csc.api.entity.Employee;

@Repository
public class EmployeeDaoImpl implements EmployeeDao {
	
	@Autowired
	private JdbcTemplate jdbctemplate;

	@Override
	public List<Employee> findAll() {
		String sql="select * from T_EMPLOYEE";
		RowMapper<Employee> rowMapper=new BeanPropertyRowMapper<Employee>(Employee.class);
		
		return this.jdbctemplate.query(sql, rowMapper);
	}


	@Override
	public List<Employee> updateAll() {
		
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
