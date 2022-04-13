package com.example.demo.bean;

import org.springframework.stereotype.Component;

@Component
public class Hitachi implements Harddisk {

	@Override
	public String details() {
		System.out.println("Implementation");
		return "This is Hitachi Class";
	}

}
