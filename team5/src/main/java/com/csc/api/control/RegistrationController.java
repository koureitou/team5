package com.csc.api.control;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import com.csc.api.form.RegisterUserForm;
import com.csc.api.service.UserService;

@Controller
public class RegistrationController {

	@Autowired
	private UserService userService;

	@GetMapping("/registerUser")
	public String showRegistrationForm(Model model) {
		RegisterUserForm registerUserForm = new RegisterUserForm();
		registerUserForm.setUserId(userService.getUserMaxId());
		model.addAttribute("registerUserForm", registerUserForm);
		return "rigisterUser";
	}
	@PostMapping("/resultUser")
	public String registerUser(RegisterUserForm registerUserForm) {
		userService.insertUser(registerUserForm);
		return "redirect:/login";
	}
	
	
	 
}
