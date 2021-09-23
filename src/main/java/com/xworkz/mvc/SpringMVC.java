package com.xworkz.mvc;

import java.io.Serializable;

public class SpringMVC implements Serializable{
	
	private String name;
	
	public SpringMVC() {
		System.out.println(this.getClass().getSimpleName() + "Bean created");
	}

}
