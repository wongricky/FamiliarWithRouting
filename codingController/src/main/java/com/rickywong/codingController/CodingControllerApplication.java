package com.rickywong.codingController;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class CodingControllerApplication {

	public static void main(String[] args) {
		SpringApplication.run(CodingControllerApplication.class, args);
	}
	
	@RequestMapping("/")
	public String coding() {
		return "Hello Coding Dojo!";
	}
	

}
