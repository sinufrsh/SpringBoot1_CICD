package com.example.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	@GetMapping("/hello")
	public String hello() {
	    return "Hello from version 4 - Deployed by GitHub Actions!";
	}
	
	@GetMapping("/new-api")
	public String newApi() {
	    return "New API deployed successfully using GitHub Actions + systemd!";
	}
	
	@GetMapping("/Eip")
	public String ElasticIP() {
	    return "checking throgh Elastic IP";
	}
}