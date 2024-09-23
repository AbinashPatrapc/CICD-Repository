package com.cicd;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CicdTestingProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(CicdTestingProjectApplication.class, args);
		System.out.println("Application Started");
	}

}
