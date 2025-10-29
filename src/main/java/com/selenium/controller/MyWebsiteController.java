package com.selenium.controller;

import java.io.IOException;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttribute;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.selenium.dto.WebsitInfoDto;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;

@Controller
//@ControllerAdvice

@SessionAttributes("webInfo")
public class MyWebsiteController {

	@ModelAttribute("webInfo")
	public WebsitInfoDto getWebDto() {

		System.out.println("************************");

		System.out.println(" Inside @ModelAttribute getWebDto() method");

		WebsitInfoDto infoDto = new WebsitInfoDto();

		infoDto.setWebsieName("seleniumExpress.com");
		infoDto.setWebsiteCategory("Education");

		System.out.println("************************");

		return infoDto;
	}

	@RequestMapping("/showinfo")
	public String showWebsiteInfo(@ModelAttribute("webInfo") WebsitInfoDto infoDto) throws IOException {

		System.out.println(" Inside @RequestMapping showWebsiteInfo() method");

		if (1 == 1) {

			throw new IOException();
		}

		System.out.println(infoDto.getWebsieName());
		System.out.println(infoDto.getWebsiteCategory());

		System.out.println("session obj :" + infoDto.getWebsieName());

		return "index";
	}

	@RequestMapping("/showCompanyInfo")
	public String showCompanyInfo(@ModelAttribute("webInfo") WebsitInfoDto InfoDto) {

		System.out.println(" Inside @RequestMapping showCompanyInfo() method");

		System.out.println(InfoDto.getWebsieName());
		System.out.println(InfoDto.getWebsiteCategory());

		return "index";
	}
}
