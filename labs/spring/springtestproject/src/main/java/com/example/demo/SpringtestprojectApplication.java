package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringtestprojectApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringtestprojectApplication.class, args);
	}
	@RequestMapping("/path")
	public String getLol()
	{
		return "LoL :D ";
	}
}
