package com.training.day4;

public class Employee4 {

	private int empId;
	private String name;
	public String ssn;
	public double salary;
	
	public Employee4(int empId, String name, String ssn, double salary) {
		this.empId = empId;
		this.name = name;
		this.ssn = ssn;
		this.salary = salary;
	}
	
	public String getDetails() {
		return "Employee id: " + empId + " Employee name:" + name;
	}
	
	
	public boolean equals(Object o) {
		boolean result = false;
		if((o != null) && o instanceof Employee4) {
			Employee4 e = (Employee4) o;
			if((e.empId == this.empId)) {
				return true;
			}
		}
		return result;
	}
}
