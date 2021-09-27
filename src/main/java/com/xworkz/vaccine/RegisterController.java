package com.xworkz.vaccine;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.xworkz.vaccine.dto.RegisterDTO;
import com.xworkz.vaccine.service.RegisterService;

@Component
@RequestMapping
public class RegisterController {
	
	@Autowired
	private RegisterService registerService;
	
public RegisterController() {
	System.out.println("bean created");
}
@RequestMapping(value="/onRegister.xworkz")
public String onRegisterButtonClicked(@RequestParam String UserName,
		@RequestParam String email,
		@RequestParam String password,
		@RequestParam String confirmPassword,
		@RequestParam String phoneNo,
		@RequestParam String vaccineType,
		@RequestParam String aadharNo, 
		@RequestParam String gender, Model model) {
	System.out.println("onRegisterButtonClicked()");
	System.out.println(UserName+"\t"+email+"\t"+password+"\t"+confirmPassword+"\t"+phoneNo+"\t"+vaccineType+"\t"+aadharNo+"\t"+gender);
	
	RegisterDTO dto = new RegisterDTO(UserName,email,password,confirmPassword,phoneNo,vaccineType,aadharNo,gender);
	System.out.println("data has been copied " +dto);
	
	boolean outCome = this.registerService.validateRegisterDTO(dto);
	if(outCome) {
		System.out.println("saved");
		model.addAttribute("message","Registration success");
		return "/WEB-INF/page/LoginPage.jsp";
	}else {
		System.out.println("not saved");
		model.addAttribute("message","Registration failed");
		return "redirect:index.jsp";
	}
}

}
