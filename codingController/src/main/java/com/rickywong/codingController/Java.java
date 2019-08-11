package com.rickywong.codingController;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class Java {
	@RequestMapping("/java")
	public String python() {
		return "Java/Spring is better!";
	}
}
 
