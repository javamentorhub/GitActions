package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringBootDemoApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext contect = SpringApplication.run(SpringBootDemoApplication.class, args);
		Student student = contect.getBean(Student.class);
		student.naga();

	}

}
