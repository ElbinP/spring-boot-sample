package com.example.demo;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/demo")
public class HelloWorldController {

	@GetMapping("/hello")
	public String getMessage() {
		return "Hello World";
	}

	@GetMapping(value = "/healthcheck", produces = { MediaType.APPLICATION_JSON_VALUE })
	public String health() {
		return "success";
	}

}
