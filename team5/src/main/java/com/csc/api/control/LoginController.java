package com.csc.api.control;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.csc.api.entity.User;
import com.csc.api.service.UseService;

@Controller
public class LoginController {
	
    @Autowired
	private UseService useService;
	@GetMapping("/login")
    public String loginForm() {
        return "login";
    }

    @PostMapping("/findByUsername")
    public String login(@RequestParam String userName, @RequestParam String pwd, Model model) {
        User user = useService.findByUsername(userName);
        if (user != null && user.getPwd().equals(pwd)) {
            return "redirect:/findAll";
        } else {
            model.addAttribute("error", "ユーザー名前またパスワードは間違いです、もう一度を確認してください！");
            return "login";
        }
    }
}
