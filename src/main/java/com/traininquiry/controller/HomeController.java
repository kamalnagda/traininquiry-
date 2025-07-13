package com.traininquiry.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

	@RequestMapping("/message")
	public String message() {
		
		return "I LOVE U , Hello Sonal , this message is from you bubu i miss u bubu ,";
	}
}
