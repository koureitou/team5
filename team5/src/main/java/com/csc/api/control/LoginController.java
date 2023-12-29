package com.csc.api.control;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.csc.api.entity.User;
import com.csc.api.form.LoginForm;
import com.csc.api.service.UseService;

import jakarta.validation.constraints.NotBlank;

@Controller
public class LoginController {

	@Autowired
	private UseService useService;

	@GetMapping("/login")
	public String loginForm(LoginForm loginForm) {
		return "login";
	}

	@PostMapping("/findByUsername")
	public String login(@Validated LoginForm loginForm, BindingResult result, Model model) {
		
		if(loginForm.getUserId()==null) {
			return "login";
			
		}else {
		
		User user = useService.findByUsername(loginForm.getUserId());

		if (result.hasErrors()) {

			return "login";
		} else {
			if (user != null && user.getPwd().equals(loginForm.getPwd())) {
				return "redirect:/findAll";
			} else {
				model.addAttribute("error", "ユーザー名前またパスワードは間違いです、もう一度を確認してください！");
				return "login";
			}
		}

	}
	}
}
