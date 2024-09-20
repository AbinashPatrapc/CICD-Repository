package com.cicd.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController 
public class Controller {

	@GetMapping
	public String getMessage() {
		return "<h1 style='color:red;text-align:center'>Welcome to Netweb</h1>";
	}
}
