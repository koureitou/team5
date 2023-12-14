package com.csc.api.control;



import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.csc.api.form.RegisterForm;

@Controller
public class RegisterController {

	@GetMapping("/register")
	public String view1(RegisterForm from) {
		return "name";
	}
    @PostMapping("/result")
    public String view2(RegisterForm from) {
	   
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
