package com.training.day2;

public class Manager extends Employee1 {
	
	public String deptName;

	public Manager(int empId, String name,
			String ssn, double salary, String dept) {
		
		// super keyword is used call the constructor of the parent class
		// should be the first statement in a constructor.
		super(empId, name, ssn, salary);
		this.deptName = dept;
	}
	
	public String getDeptName() {
		return deptName;
	}
	
	// Manager gets all of Employee's public methods!
}
