package com.example.demo;

import org.springframework.stereotype.Component;

@Component("naga")
public class Employee {
	
	private int eId;
	private String eName;
	
	
	
	
	public int geteId() {
		return eId;
	}
	public void seteId(int eId) {
		this.eId = eId;
	}
	public String geteName() {
		return eName;
	}
	public void seteName(String eName) {
		this.eName = eName;
	}
	
	public void sal() {
		System.out.println("30,50000");
	}

}
