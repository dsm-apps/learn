package com.training.day2;

// Class Declaration
public class Employee1 {

	// Variables or fields
	private int empId;
	private String name;
	private String ssn;
	private double salary;
	
	public Employee1(int empId, String name,
			String ssn, double salary) {
		this.empId = empId;
		this.name = name;
		this.ssn = ssn;
		this.salary = salary;
	}
	
	public void setName(String name) {
		if(name != null) {
			this.name = name;
		}
	}
	
	public void raiseSalary(double salary) {
		this.salary += salary;
	}
}

/**
 *  - Constructor with parameter to make it immutable; (Remove no-arg constructor)
 *  - The class has no setter so initial values has to be via constructor.
 *  - Removing setter methods makes immutable Employee ID and SSN
 */
