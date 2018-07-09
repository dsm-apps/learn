package com.training.day1;

// Class Declaration
public class Employee {

	// Variables or fields
	public int empId;
	public String name;
	public String ssn;
	public double salary;
	
	// a constructor
	public Employee() {
		
	}
	
	// a method
	public int getEmpId() {
		return this.empId;
	}
	
	public void setSalary(double salary) {
		this.salary = salary;
	}
}

/**
 * 1) Constructor creates an instance of an object called Employee
 * 2) Constructors do not return any type.
 * 3) Declared as the same name as the class name;
 * 4) You can declare more than 1 constructors
 * 
 * Methods which gets the value is called "accessors" (getters)
 * Methods which sets the value is called "mutators"  (setters)
 * 
 * "this" keyword used to represent current class;
 */
