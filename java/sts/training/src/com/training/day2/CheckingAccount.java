package com.training.day2;

public class CheckingAccount {

	private int custID;
	private String name;
	private double amount;
	
	public CheckingAccount() {
		
	}
	
	public void setAmount(double amount) {
		this.amount = amount;
	}
	
	public double getAmount() {
		return this.amount;
	}
	
	//... other public accessor and mutator methods
}

/**
 * public = applied to fields and methods, allows any class in any package to access.
 * private = applied to fields and methods, allows access only to the other methods within the class itself.
 * 
 * private keyword can also be applied to a method to hide an implementation detail
 */
