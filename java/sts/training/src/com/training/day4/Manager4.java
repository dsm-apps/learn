package com.training.day4;

public class Manager4 extends Employee4 {

	private String deptName;

	public Manager4(int empId, String name, String ssn, double salary, String dptName) {
		super(empId, name, ssn, salary);
		this.deptName = dptName;
	}
	
	public String getDetails() {
		return super.getDetails() + " Department:" + deptName;
	}
	
		
	public static void main(String[] args) {
		Employee4 e = new Employee4(101, "Jim Smith", "022-23-2345", 100_000.00);
		Manager4 m = new Manager4(102, "Jim Kern", "022-23-4567", 110_450.54, "Marketing");
		Employee4 mgr = new Manager4(103, "Jim Carry", "022-23-6789", 120_650.67, "Sales");

		System.out.println(e.getDetails());
		System.out.println(m.getDetails());
		System.out.println(mgr.getDetails());  // Virtual Method invocation
		
		
		// Casting objects
		Manager4 mmm = (Manager4) mgr;
		
	}
}
