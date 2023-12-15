package com.csc.api.control;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.csc.api.form.RegisterForm;
import com.csc.api.service.EmpService;

@Controller
public class RegisterController {

	@Autowired
	private EmpService empService;

	@GetMapping("/register")
	public String view1(Model model){
		RegisterForm registerForm = new RegisterForm();
		registerForm.setEmployeeId(empService.getEmpMaxId());
		model.addAttribute("registerForm", registerForm);
		return "name";
	}

	@PostMapping("/result")
	public String view2(RegisterForm form) {

//String sql= "INSERT INTO t_employee (
//				emp_name,password,gender,department_id,phone,
//				email,create_user,update_user
//				) VALUES (
//					#{empName},#{password},#{gender},#{departmentId},#{phone},
//					#{email},#{createUser},#{updateUser}
//				);"

		return "name";
	}
}
