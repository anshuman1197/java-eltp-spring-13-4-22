package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.example.demo.bean.Student;

@SpringBootApplication
public class SpringSimpleDemo1Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext c=SpringApplication.run(SpringSimpleDemo1Application.class, args);
		Student student=(Student)c.getBean(Student.class);
		System.out.println(student);
	}

}
