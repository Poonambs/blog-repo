package com.jbk.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/admin")
public class AdminController {
	
	@DeleteMapping("/delete-post")
	public String deletePost() {
		return "deleted";
		
	}

}
