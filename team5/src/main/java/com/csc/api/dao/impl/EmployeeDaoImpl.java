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
		//Employee employee=new Employee();
		//employeeId=employee.getEmployeeId();
		String sql="select * from T_EMPLOYEE where EMPLOYEE_ID="+employeeId;
		RowMapper<Employee> rowMapper=new BeanPropertyRowMapper<Employee>(Employee.class);
		jdbctemplate.query(sql, rowMapper);
		return this.jdbctemplate.query(sql, rowMapper);
	
	}


	@Override
	public List<Employee> updateAll() {
		
		return null;
	}
	@Override
	public List<Employee> addAll() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public void deleteById(int employeeId) {
		// TODO Auto-generated method stub
		
	}

//	@Override
//	public void deleteById(int employeeId) {
//		
//		Employee employee=new Employee();
//		employeeId=employee.getEmployeeId();
//		String sql="delete from T_EMPLOYEE where EMPLOYEE_ID=? ";
//		RowMapper<Employee> rowMapper=new BeanPropertyRowMapper<Employee>(Employee.class);
//		jdbctemplate.query(sql, rowMapper);
//	}

//	@Override
//	public List<Employee> addAll() {
//		
//		return null;
//	}


//	@Override
//	public List<Employee> selectById(int employeeId) {
//		Employee employee=new Employee();
//		employeeId=employee.getEmployeeId();
//		String sql="select * from T_EMPLOYEE where EMPLOYEE_ID="+employeeId;
//		RowMapper<Employee> rowMapper=new BeanPropertyRowMapper<Employee>(Employee.class);
//		jdbctemplate.query(sql, rowMapper);
//	
//		return this.jdbctemplate.query(sql, rowMapper);
//	}


	

}
