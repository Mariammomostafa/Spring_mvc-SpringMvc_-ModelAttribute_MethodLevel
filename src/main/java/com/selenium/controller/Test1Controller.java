package com.selenium.controller;

import java.io.IOException;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttribute;

import com.selenium.dto.Server;
import com.selenium.dto.WebsitInfoDto;

@Controller
public class Test1Controller {
	
	private Server server;
	
	
	@RequestMapping("/test")
	public String test(@ModelAttribute("webInfo") WebsitInfoDto InfoDto ,  @SessionAttribute("mrmr") WebsitInfoDto dto) throws IOException {
		
		
         System.out.println(" Inside  test() method");
		
         
		try {
			System.out.println(" get session obj through @SessionAttribute : " +dto);
		} catch (Exception e) {
			System.out.println(" can NOT get attribute mrmr from the session");
		}
		
		System.out.println(" Inside different contrpller @RequestMapping test() method");
		
		System.out.println(InfoDto.getWebsieName());
		System.out.println(InfoDto.getWebsiteCategory());
		
		
		if(1==1) {
			
			throw new IOException();
		}
		
		System.out.println("IP address of the server is : "+ server.getServerIp());
		return "index";
	}
	
	

}
