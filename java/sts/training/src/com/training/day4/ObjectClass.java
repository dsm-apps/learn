package com.training.day4;

public class ObjectClass {

	public static void main(String[] args) {
		
		Employee4 emp = new Employee4(1, "Bala", "123456", 15000);
		
		String test = "Bala";
		
		emp.equals(test);
		
		System.out.println(new ObjectClass().hashCode());
	}
	
}
