package com.xwrokz.spring.registration.controller;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Component
@RequestMapping("/")
public class RegisterController {

	public RegisterController() {
		System.out.println(this.getClass().getSimpleName() + " bean created");
	}
	@RequestMapping(value = "/register.xworkz")
	public String onClick() {
		System.out.println("Invoked onClick");
		return "/WEB-INF/page/RegistrationResponse.jsp";
	}
	@RequestMapping(value = "/username.xworkz")
	public String onRequestButtonClicked(@RequestParam String userName, @RequestParam String email,  @RequestParam String password,  @RequestParam String confirmPwd,  @RequestParam int phoneNo,  @RequestParam String gender, @RequestParam String state) {
		System.out.println("Invoked onClicked" + userName);
		System.out.println("Invoked onClicked" + email);
		System.out.println("Invoked onClicked" + password);
		System.out.println("Invoked onClicked" + confirmPwd);
		System.out.println("Invoked onClicked" + phoneNo);
		System.out.println("Invoked onClicked" + gender);
		System.out.println("Invoked onClicked" + state);
		System.out.println();
		return "/WEB-INF/page/RegistrationResponse.jsp";
	}
}
