package com.selenium.dto;


public class WebsitInfoDto {
	
	private String websieName;
	
	private String websiteCategory;
	
	

	public WebsitInfoDto() {
		
		System.out.println(" inside WebsitInfoDto constructor ...");
	}

	public String getWebsieName() {
		return websieName;
	}

	public void setWebsieName(String websieName) {
		this.websieName = websieName;
	}

	public String getWebsiteCategory() {
		return websiteCategory;
	}

	public void setWebsiteCategory(String websiteCategory) {
		this.websiteCategory = websiteCategory;
	}

	@Override
	public String toString() {
		return "WebsitInfoDto [websieName=" + websieName + ", websiteCategory=" + websiteCategory + "]";
	}
	
	

}
