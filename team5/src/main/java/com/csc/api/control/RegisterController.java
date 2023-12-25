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
	public String view2(RegisterForm registerForm) {
		empService.add(registerForm);
		return "redirect:/findAll";
	}
	@GetMapping("/updateEmp")
	public String updateView1(Model model){
//		RegisterForm registerForm = new RegisterForm();
//		registerForm.setEmployeeId(empService.getEmp());
//		model.addAttribute("updateForm", updateForm);
		return "name";
	}

	//@PostMapping("/resultEmp")
//	public String updateView2(RegisterForm registerForm) {
//		empService.add(registerForm);
		//return "redirect:/findAll";
//	}
}
