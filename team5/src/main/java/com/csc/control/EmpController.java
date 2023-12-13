package com.csc.control;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class EmpController {

	@RequestMapping("/csc/emp")
	public String emp(Model model) {
		model.addAttribute("title", "value");
		model.addAttribute("kye", "value1");
		return "emp";
	}
}
