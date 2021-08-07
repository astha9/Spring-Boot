package com.mySpringCode.springBootExample.rest;

import java.time.LocalDateTime;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloRestController {
	@GetMapping("/")
	public String getGreetings()
	{
		return "Hello World!!!"+ LocalDateTime.now();
	}

}
