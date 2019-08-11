package com.rickywong.codingController;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class Python {
	@RequestMapping("/python")
	public String python() {
		return "Python/Django was awesome!";
	}
}
 