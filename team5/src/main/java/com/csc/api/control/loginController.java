package com.csc.api.control;

import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.csc.api.entity.User;
import com.csc.api.service.UserService;

@RequestMapping("/index")
public class loginController {
	
	private UserService userService;
  
    
    public String login(String userName,String password) {
		User user=userService.login(userName,password);
    	if(user!=null) {
    		List<User> employeelist=userService.getEmployeeList;
    		
    		
    	}
		return "employeelist";	
    }
}

