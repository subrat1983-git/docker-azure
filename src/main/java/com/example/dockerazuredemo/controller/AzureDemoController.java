package com.example.dockerazuredemo.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/azure")
public class AzureDemoController {

	
    @GetMapping(value = "/demo")
	public ResponseEntity<String> getAzureDemo() {
		 return ResponseEntity.status(200).body("Hello Azure Demo");
		
	}
}
