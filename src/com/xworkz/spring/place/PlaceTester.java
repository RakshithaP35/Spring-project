package com.xworkz.spring.place;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.TreeSet;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.xworkz.spring.place.Place;

public class PlaceTester {

	public static void main(String[] args) {
		String beanCfgFile = "applicationContext.xml";
		ApplicationContext container = new ClassPathXmlApplicationContext(beanCfgFile);
		
		String place1 = container.getBean(String.class);
		System.out.println(place1);

		Integer place2 = container.getBean(Integer.class);
		System.out.println(place2);
		
		Short place3 = container.getBean(Short.class);
		System.out.println(place3);
		
		Float place4 = container.getBean(Float.class);
		System.out.println(place4);
		
    	Double place5 = container.getBean(Double.class);
		System.out.println(place5);
		
		Character place6 = container.getBean(Character.class);
		System.out.println(place6);
		
		Boolean place7 = container.getBean(Boolean.class);
		System.out.println(place7);
		
		Byte place8 = container.getBean(Byte.class);
		System.out.println(place8);
		
		ArrayList <String> arraylist = new ArrayList<String>();
		arraylist.add("rakshitha");
		arraylist.add("aaaa");
		System.out.println(arraylist);
		
		HashSet <String> hashSet = new HashSet<String>();
		hashSet.add("bangalore");
		hashSet.add("mysore");
		hashSet.add("bangalore");
		hashSet.add("mangalore");
		System.out.println(hashSet);
		
		TreeSet <String> treeSet = new TreeSet<String>();
		treeSet.add("bangalore");
		treeSet.add("mysore");
		treeSet.add("bangalore");
		treeSet.add("mangalore");
		System.out.println(treeSet);
		
	}

}
