package com.xworkz.mvc.controller;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;

@Component
@RequestMapping("/")
public class SpringController {
	public SpringController() {
		System.out.println("Bean Created");
	}
	
	@RequestMapping(value = "/ab.xworkz")
	public void onClick() {
		System.out.println("Invoked onCLick once");
	}

	@RequestMapping(value = "/cd.xworkz")
	public void onClick1() {
		System.out.println("Invoked onCLick twice");
	}

	@RequestMapping(value = "/ef.xworkz")
	public void onClick2() {
		System.out.println("Invoked onCLick thrice");
	}

}
