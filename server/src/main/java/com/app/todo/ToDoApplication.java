package com.app.todo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class ToDoApplication {

	public static void main(String[] args) {
	
		SpringApplication.run(ToDoApplication.class, args);
	}
}
