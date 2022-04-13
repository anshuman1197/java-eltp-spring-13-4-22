package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.example.demo.bean.Laptop;

@SpringBootApplication
public class SpringSimpleDemoApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext c=SpringApplication.run(SpringSimpleDemoApplication.class, args);
		Laptop laptop=(Laptop)c.getBean(Laptop.class);
		laptop.show();
	}

}
