package com.example.springboot;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/hello2")
public class Hello2Controller
{

	@GetMapping("/")
	public String index() {
		return "Greetings from Spring Boot!";
	}

}
