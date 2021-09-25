package com.xworkz.mvc.controller;

import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Component
@RequestMapping("/")
public class SpringController {
	public SpringController() {
		System.out.println("Bean Created");
	}
	
	@RequestMapping(value = "/actor.xworkz")//data binding
	public String onRequestbuttonClicked(@RequestParam String actorname,@RequestParam String actress, Model model) {
		
		System.out.println("Invoked onRequestbuttonClicked");
		
		System.out.println("actor name is "+ actorname );
		System.out.println("actor name is "+ actress );
		
		String data= "Thank you";
		
		model.addAttribute("message",actorname);
		
		return "/WEB-INF/page/abResponse.jsp";
		
	}
	
	@RequestMapping(value = "/ab.xworkz")
	public String onClick() {
		System.out.println("Invoked onCLick once");
		
		return "/WEB-INF/page/abResponse.jsp";
	}

	@RequestMapping(value = "/cd.xworkz")
	public String onClick1() {
		System.out.println("Invoked onCLick twice");
		return "/WEB-INF/page/cdResponse.jsp";

	}

	@RequestMapping(value = "/ef.xworkz")
	public String onClick2() {
		System.out.println("Invoked onCLick thrice");
		return "/WEB-INF/page/efResponse.jsp";

	}

}
