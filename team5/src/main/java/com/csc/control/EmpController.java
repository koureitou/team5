package com.csc.control;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import com.csc.dao.EmployeeDao;
import com.csc.entity.Employee;


@Controller
@RequestMapping("/employee")
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
}
