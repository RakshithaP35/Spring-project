package com.xworkz.spring.place;

public class Place {
	private String language;
	private String location;

	public Place(String language, String location) {
		this.language = language;
		this.location = location;
	}
	
	public void noOfDistrict() {
		System.out.println(this.getClass().getSimpleName() + " Invoked runWay");
	}
	public void famousPlace() {
		System.out.println(this.getClass().getSimpleName() + " Invoked maintenance");
	}

	

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	@Override
	public String toString() {
		return "Place [language=" + language + ", location=" + location + "]";
	}

	


}
