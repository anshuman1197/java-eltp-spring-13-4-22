package com.example.demo.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Laptop {
	@Autowired
	Harddisk hd;
	public void show() {
		System.out.println("This is laptop");
		System.out.println(hd.details());
	}

}
