package com.csc.api.control;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.csc.api.entity.Employee;

import com.csc.api.form.SelectForm;
import com.csc.api.service.UserService;

@Controller
public class UserController {
	
	@Autowired
	private UserService  userService;
	
	@GetMapping("/findAll")
	public String findAll(SelectForm selectForm,Model model) {
		List<Employee> employeelist=userService.findAll();
		System.out.println(employeelist);
		model.addAttribute("employeelist", employeelist);
		return "employeelist";
	}
	@PostMapping("/findByKeyword")
	public String findByKeyword(SelectForm selectForm,Model model) {
		List<Employee> employeelist=userService.findByKeyword(selectForm);
		System.out.println(selectForm.getEmployeeId());
		model.addAttribute("employeelist", employeelist);
		return "employeelist";
	}
	
	
	@PostMapping("/delById")
    public String delById(@RequestParam("selectedIds") String selectedIds) {
        List<Long> ids = Arrays.asList(selectedIds.split(","))
            .stream()
            .map(Long::valueOf)
            .collect(Collectors.toList());
       
        userService.delById(ids);
        return "redirect:/findAll"; 
    }

}