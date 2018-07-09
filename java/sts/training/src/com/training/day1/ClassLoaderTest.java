package com.training.day1;

public class ClassLoaderTest {

	public static void main(String[] args) throws ClassNotFoundException {
		
		Employee e = new Employee();
		
		// Same as above class loading.
		ClassLoaderTest.class.getClassLoader().loadClass("com.training.Employee");
	}
	
}
