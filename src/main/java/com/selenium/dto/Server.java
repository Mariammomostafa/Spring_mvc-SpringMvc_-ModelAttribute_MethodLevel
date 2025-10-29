package com.selenium.dto;

import org.springframework.stereotype.Component;

@Component
public class Server {
	
	private String serverIp;

	public String getServerIp() {
		return serverIp;
	}

	public void setServerIp(String serverIp) {
		this.serverIp = serverIp;
	}
	
	

}
