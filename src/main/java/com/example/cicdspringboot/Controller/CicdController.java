package com.example.cicdspringboot.Controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.cicdspringboot.Service.UserService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/")
@RequiredArgsConstructor
public class CicdController {

	private final UserService userService;

	@GetMapping("/")
	public String hello() {
		return "돼라.";
	}


	@PostMapping("/save")
	public ResponseEntity<String> save(@RequestBody String name) {
		String result = userService.save(name);
		return new ResponseEntity<>(result, HttpStatus.OK);
	}
}
