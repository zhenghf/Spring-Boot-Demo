package com.zheng.springboot.war.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/hello")
public class HelloController {

	@RequestMapping
	public String hello(@RequestParam String name) {
		return "Hello, " + name;
	}
}
