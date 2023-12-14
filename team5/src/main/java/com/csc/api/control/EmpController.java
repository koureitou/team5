package com.csc.api.control;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


import com.csc.api.dao.EmployeeDao;
import com.csc.api.entity.Employee;


@Controller
//@GetMapping("/select")
public class EmpController {
	
	@Autowired
	EmployeeDao employeeDao;

	@GetMapping("/findAll")
	public String findAll(Model model) {
		List<Employee> employeelist=employeeDao.findAll();
		System.out.println(employeelist);
		model.addAttribute("employeelist", employeelist);
		return "employeelist";
	}
	
	//@GetMapping("/addAll")
	public String addAll(Model model) {
		List<Employee> employeelist=employeeDao.addAll();
		System.out.println(employeelist);
		model.addAttribute("employeelist", employeelist);
		return "employeelist";
	}
}
