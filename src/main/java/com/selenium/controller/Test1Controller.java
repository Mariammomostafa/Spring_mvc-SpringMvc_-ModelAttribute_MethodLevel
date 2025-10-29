package com.selenium.controller;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.selenium.dto.Server;
import com.selenium.dto.WebsitInfoDto;

@Controller
public class Test1Controller {
	
	@Autowired
	private Server server;
	
	
	@RequestMapping("/test")
	public String test(@ModelAttribute("webInfo") WebsitInfoDto InfoDto ) throws IOException {
		
		
         System.out.println(" Inside  test() method");
		
		System.out.println(" Inside different controller @RequestMapping test() method");
		
		System.out.println(InfoDto.getWebsieName());
		System.out.println(InfoDto.getWebsiteCategory());
			
		System.out.println("IP address of the server is : "+ server.getServerIp());
		return "index";
	}
	
	

}
