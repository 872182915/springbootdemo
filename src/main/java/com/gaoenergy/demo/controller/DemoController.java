package com.gaoenergy.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
	@RequestMapping("/hello")
	public Object hello() {
		return "hello";
	}
}
