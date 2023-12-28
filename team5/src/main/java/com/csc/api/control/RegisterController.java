package com.csc.api.control;

import java.text.SimpleDateFormat;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.csc.api.entity.Employee;
import com.csc.api.form.LoginForm;
import com.csc.api.form.RegisterForm;
import com.csc.api.service.EmpService;
import com.csc.api.service.UserService;

@Controller
public class RegisterController {

	@Autowired
	private EmpService empService;
	@Autowired
	private UserService userService;


	@GetMapping("/register")
	public String view1(Model model){
		RegisterForm registerForm = new RegisterForm();
		registerForm.setEmployeeId(empService.getEmpMaxId());
		model.addAttribute("registerForm", registerForm);
		return "name";
	}

	@PostMapping("/result")
	public String view2(@Validated RegisterForm registerForm, BindingResult result,Model model) {
		
		if (result.hasErrors()) {
			model.addAttribute("error", "*入力項目は空に出来ません、もう一度を確認してください！");
			return "name";
		} else {
//			if (registerForm.getEmployeeName()!= null && registerForm.getEmployeeStartdate()!=null && 
//					registerForm.getDeptId()!=null && registerForm.getGenderTypeNo()!=null) {
				empService.add(registerForm);
				return "redirect:/findAll";
			} 
	//	else {
		//		model.addAttribute("error", "*入力項目は空に出来ません、もう一度を確認してください！");
		//		return "name";
		//	}
	//	}
		
		
	}
	@GetMapping("/update/{employeeId}")
	public String view3(@PathVariable Integer employeeId,Model model){
		RegisterForm registerForm = new RegisterForm();
		Employee employee=userService.getById(employeeId);
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		String startDate=sdf.format(employee.getEmployeeStartdate());
		String birthDate=sdf.format(employee.getEmployeeBirthday());
		
	    registerForm.setEmployeeId(employee.getEmployeeId());
	    registerForm.setDeptId(employee.getDeptId());
	    registerForm.setEmployeeStartdate(startDate);
	    registerForm.setEmployeeEmail(employee.getEmployeeEmail());
	    registerForm.setGenderTypeNo(employee.getGenderTypeNo());
	    registerForm.setEmployeeAddress(employee.getEmployeeAddress());
	    registerForm.setEmployeeBirthday(birthDate);
	    registerForm.setEmployeeAddress(employee.getEmployeeAddress());
	    registerForm.setEmployeeName(employee.getEmployeeName());
	    registerForm.setEmployeeTel(employee.getEmployeeTel());

		model.addAttribute("registerForm", registerForm);
		return "name";
	}

	@PostMapping("/resultUpdate")
	public String view4(RegisterForm registerForm) {
		empService.updateEmp(registerForm);
		return "redirect:/findAll";
	}
	
}
