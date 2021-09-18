package com.xworkz.spring.fruits;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class FruitsTester {

	public static void main(String[] args) {
		String beanConfigurationPath = "applicationContext.xml";
		
		ApplicationContext container = new ClassPathXmlApplicationContext(beanConfigurationPath);
		
		Fruits fruit = container.getBean(Fruits.class);
		System.out.println(fruit.color);
		System.out.println(fruit.name);
		System.out.println(fruit.price);
		System.out.println(fruit.taste);
		
		fruit.eat();
		
		System.out.println(fruit.vitamine.type);
		System.out.println(fruit.vitamine.isFatSouluble);
		System.out.println(fruit.vitamine.isWaterSoluble);


	}

}