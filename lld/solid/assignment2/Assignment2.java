package com.manan.dal.assignment2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication(scanBasePackages = { "com.manan.dal.assignment2.bad","com.manan.dal.assignment2.good"} )
public class Assignment2 {

	@GetMapping("/")
	public String index() {
		return "Greetings from Assignment2!";
	}

	public static void main(String[] args) {
		SpringApplication.run(Assignment2.class, args);
	}
}
