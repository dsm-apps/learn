package com.training.day1;

public class EmployeeUser {

	public static void main(String[] args) {
		Employee emp = new Employee();
		emp.empId = 101; 
		// Legal if the field is public, but not good practice use setters.
		// Negates the principles of encapsulation
		
		//emp.setEmpId(101);
		//emp,setName("John Smith");
		//emp.setSsn("011-22-2467");
		//emp.setSalary(120345.27);
	}
	
	
	/**
	 * Create instance of Employee
	 * Assign reference to a variable called emp
	 */
	
	// An instance of the object is created when "new" keyword is used with a constructor.
	
	
	public void objectParameters() {
		Employee x = new Employee();
		foo(x);
	}
	
	public void foo(Employee e) {
		e = new Employee();
		e.setSalary(1_000_000.00);  // What happens to X here.
		
		// Once returned Object "e" is not referred by anyone, so it's ready for garbage collection.
	}
}
