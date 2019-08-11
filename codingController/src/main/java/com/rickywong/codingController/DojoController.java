package com.rickywong.codingController;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DojoController {

	public static void main(String[] args) {
		SpringApplication.run(CodingControllerApplication.class, args);
	}
	
	@RequestMapping("/{route}")
	public String route(@PathVariable("route") String route) {
		switch(route) {
		case "dojo": return "The dojo is awesome!";
		case "burbank-dojo": return "Burbank Dojo is located in Southern California.";
		case "san-jose": return "San Jose Dojo is the headquarters.";
		}
		return null;
	}
	

}
