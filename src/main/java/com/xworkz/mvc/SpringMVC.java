package com.xworkz.mvc;

import java.io.Serializable;

public class SpringMVC implements Serializable {

	public SpringMVC() {
		System.out.println(this.getClass().getSimpleName() + "Bean created");
	}

}
