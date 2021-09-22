package com.xworkz.spring.apartment.tester;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.xworkz.spring.apartment.entity.ApartmentEntity;
import com.xworkz.spring.apartment.service.ApartmentService;

public class ApartmentTester {

	public static void main(String[] args) {
		ApplicationContext container = new ClassPathXmlApplicationContext("applicationContext.xml");
		ApartmentService service = container.getBean(ApartmentService.class);
		ApartmentEntity entity = new ApartmentEntity();
		
		entity.setLocation("Sarjapura");
		entity.setLiftAvailable(true);
		entity.setNoOfFloors(21);
		entity.setPrice(2000000);
		
		
		
		service.validateAndSave(entity);
		
	}

}
