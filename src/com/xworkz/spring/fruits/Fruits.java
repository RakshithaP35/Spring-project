package com.xworkz.spring.fruits;

public class Fruits {
	public String name;
	public String color;
	public float price;
	public String taste;

	public Vitamine vitamine;

	public Fruits(String name, String color, float price, String taste, Vitamine vitamine) {
		super();
		this.name = name;
		this.color = color;
		this.price = price;
		this.taste = taste;
		this.vitamine = vitamine;
		System.out.println(this.getClass().getSimpleName() + "Bean created");
	}

	void eat() {
		System.out.println("Invoked eat()");
		vitamine.healthy();
	}

	@Override
	public String toString() {
		return "Fruits [name=" + name + ", color=" + color + ", price=" + price + ", taste=" + taste + ", vitamine="
				+ vitamine + "]";
	}
}
