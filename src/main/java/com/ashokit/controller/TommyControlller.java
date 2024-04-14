package com.ashokit.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hi")
public class TommyControlller {
	
	@GetMapping("/welcome")
	public String welcomeMsg() {
		return "<h1>Welcome in git Hub</h1>";
	}

}
