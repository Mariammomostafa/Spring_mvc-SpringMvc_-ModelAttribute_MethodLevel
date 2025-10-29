package com.selenium.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttribute;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.selenium.dto.WebsitInfoDto;

@Controller
@SessionAttributes("mrmr")
public class Test2Controller {
	
	@ModelAttribute("mrmr")
	public WebsitInfoDto getWebDto() {
		
		System.out.println("************************");
		
		System.out.println(" Inside @ModelAttribute getWebDto() method");
		
		WebsitInfoDto  infoDto = new WebsitInfoDto();
		
		infoDto.setWebsieName("seleniumExpress.com");
		infoDto.setWebsiteCategory("Education");
		
		System.out.println("************************");

		return infoDto;
	}
	
	@RequestMapping("/testSession")
	public String testSession(Model model) {

		System.out.println(" Inside @RequestMapping testSession() method");
		
		 		  
		System.out.println("session obj :" +model.getAttribute("mrmr"));
		  
		return "index";
	}
	
	@RequestMapping("/test2")
	public String test2( @SessionAttribute("mrmr") WebsitInfoDto dto) {

		System.out.println(" Inside @RequestMapping test2() method");
		
		System.out.println(" get session obj through @SessionAttribute : " +dto);
		  
		return "index";
	}
	
	

}
