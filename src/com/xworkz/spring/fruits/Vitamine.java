package com.xworkz.spring.fruits;

public class Vitamine {
	
	public String type;
	public boolean isWaterSoluble;
	public boolean isFatSouluble;
	
	
	public Vitamine(String type, boolean isWaterSoluble, boolean isFatSouluble) {
		super();
		this.type = type;
		this.isWaterSoluble = isWaterSoluble;
		this.isFatSouluble = isFatSouluble;
	}
	
	public void healthy() {
		System.out.println("Invoked healthy()");
	}

}
