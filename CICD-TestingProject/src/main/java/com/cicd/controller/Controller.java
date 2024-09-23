package com.cicd.controller;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController 
public class Controller {

	@GetMapping
	public String getMessage() {
		return "<h1 style='color:red;text-align:center'>Welcome to Netweb</h1>";
	}
	
	@GetMapping("/wish")
	public ResponseEntity<String> getWishMessage(){
		LocalDateTime time=LocalDateTime.now();
		int hour=time.getHour();
		String message;
		if(hour<12) {
			message="<h1 style='color:green;text-align:center'>Good Moring<br>Current Time: "+time+"</h1>";
		}else if(hour==12) {
			message="<h1 style='color:red;text-align:center'>Good Noon<br>Current Time: "+time+"</h1>";
		}else if(hour>12 && hour<18) {
			message="<h1 style='color:green;text-align:center'>Good Afternoon<br>Current Time: "+time+"</h1>";
		}else if(hour>=18 && hour<21) {
			message="<h1 style='color:orange;text-align:center'>Good Evening<br>Current Time: "+time+"</h1>";
		}else {
			message="<h1 style='color:magenta;text-align:center'>Good Night<br>Current Time: "+time+"</h1>";
		}
		return new ResponseEntity<>(message,HttpStatus.OK);
	}
	
	@GetMapping("/employee")
	public ResponseEntity<Map<String,String>> getEmployee() {
		Map<String,String> map=new HashMap<>();
		map.put("Abinash","Developer");
		map.put("Santosh","QA Analyst");
		map.put("Sachin","Devops");
		map.put("Akash","Front-end");
		map.put("Virat","Service-now");
		map.put("Sunny","SAP");
		return new ResponseEntity<>(map,HttpStatus.OK);
		
	}
}
