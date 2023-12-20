package com.csc.api.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;
import org.springframework.ui.Model;

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
	public List<Employee> selectById(int employeeId, Model model) {
	
		String sql="select * from T_EMPLOYEE where EMPLOYEE_ID="+employeeId;
		RowMapper<Employee> rowMapper=new BeanPropertyRowMapper<Employee>(Employee.class);
		jdbctemplate.query(sql, rowMapper);
		return this.jdbctemplate.query(sql, rowMapper);
		
	}
	@Override
	public List<Employee> serchByName(String employeeName,Model model){

		String sql="select * from T_EMPLOYEE where EMPLOYEE_NAME LIKE '%"+employeeName+"%'";
		RowMapper<Employee> rowMapper=new BeanPropertyRowMapper<Employee>(Employee.class);
		jdbctemplate.query(sql, rowMapper);
		
		return this.jdbctemplate.query(sql, rowMapper);
		
	}


	
}

