package com.csc.api.control;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@RequestMapping("/index")
public class selectController {
  
    public String index(@RequestParam("employeeName") String employeeName,
    		@RequestParam("employeeId") String employeeId,
    		@RequestParam("deptId") String deptId,
    		@RequestParam("employeeStartdate") String employeeStartdate
    		){
       
        return "list.html";
    }
}
