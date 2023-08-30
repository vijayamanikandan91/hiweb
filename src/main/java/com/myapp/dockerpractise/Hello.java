package com.myapp.dockerpractise;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Hello {
	
	@GetMapping(value="/hi")
	public String Hi() {
		return "hi hello";
	}
	

}
