package com.yash.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class HelloController {

	@RequestMapping("/hello")
	@ResponseBody
	public String sayHello() {
		return "Hello World";
	}
}
