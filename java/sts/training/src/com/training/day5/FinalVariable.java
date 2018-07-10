package com.training.day5;

import java.util.Date;

public class FinalVariable {
	private final int field;
	private final int forgottenField;
	private final Date date = new Date();
	
	public FinalVariable() {
		field = 100;
		
		// compile-time error -forgottenField not initialized.
	}
	
	public void changeValues(final int param) {
		param = 1; // compile-time error
		
		date.setTime(0); // allowed
		date = new Date(); // compile-time error
		
		final int localVar;
		localVar = 42; // no error during initialization
		localVar = 42; // error when changing the value.
		
	}
}
