package com.testSpring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"com.testSpring"})
public class SpringTest1Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringTest1Application.class, args);
	}
}
