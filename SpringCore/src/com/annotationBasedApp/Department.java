package com.annotationBasedApp;

import org.springframework.beans.factory.annotation.Value;

public class Department {
	@Value("${role}")
	private String role;
	@Value("${domain}")
	private String domain;
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public String getDomain() {
		return domain;
	}
	public void setDomain(String domain) {
		this.domain = domain;
	}
	

}
