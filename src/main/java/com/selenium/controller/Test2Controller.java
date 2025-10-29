package com.selenium.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttribute;

import com.selenium.dto.WebsitInfoDto;

@Controller
public class Test2Controller {
	
	
	@RequestMapping("/getSessionAttribute1")
	public String testSession(Model model) {

		System.out.println(" Inside @RequestMapping testSession() method");
		
		 		  
		System.out.println("get session obj through model :" +model.getAttribute("webInfo"));
		  
		return "index";
	}
	
	@RequestMapping("/getSessionAttribute2")
	public String test2( @SessionAttribute("webInfo") WebsitInfoDto dto) {

		System.out.println(" Inside @RequestMapping test2() method");
		
		System.out.println(" get session obj through @SessionAttribute : " +dto);
		  
		return "index";
	}
	
	

}
