package com.training.day5;

public class TestEnum {
	
	public static void main(String[] args) {
		System.out.println(ComplexEnum.ON.getDescription());
		
		ComplexEnum state = ComplexEnum.OFF;
		
		switch(state) {
			
		case OFF: System.out.println(state.getDescription());
				 state = ComplexEnum.ON;
				 break;
				 
		case ON: System.out.println(state.getDescription());
				 state = ComplexEnum.OFF;
				 break;
			
		case SUSPEND: System.out.println(state.getDescription());
				 state = ComplexEnum.OFF;
				 break;
		
		}
		
		System.out.println(state);
		
	}
	
}

enum ComplexEnum {
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

