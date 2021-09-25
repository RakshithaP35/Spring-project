package com.xworkz.mvc.controller;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/")
@Component
public class IndexController {

	public IndexController() {
		System.out.println("..");
	}
}
