package com.smartschool.www;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SchoolController 
{
	@GetMapping("/getinfo")
	public String home()
	{
		return "form";
	}
}
