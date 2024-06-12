package com.example.cicdspringboot.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class CicdController {

	@GetMapping("/")
	public String hello() {
		return "Hello, CICD!";

	}
}
