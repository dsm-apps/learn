package com.training.day5;

public enum ComplexEnum {
	
	// The below variables call the ComplexEnum constructor
	OFF("The power is off"),
	ON("The usage power is high"),
	SUSPEND("The power usage is low");

	private String description;
	
	// The constructor cannot be public / protected
	private ComplexEnum(String d) {
		this.description = d;
	}
	
	public String getDescription() {
		return description;
	}
}
