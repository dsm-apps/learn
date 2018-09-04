package com.training.day6.dao;

public class FactoryCall {

	public static void main(String[] args) {
		
		EmployeeDAO empDAO = EmployeeDAOFactory.createEmployeeDAO();
		
		Employee6 emp = new Employee6();
		emp.setFirstName("Bala");
	
		empDAO.add(emp);
		
		emp.setLastName("LastName");
		empDAO.update(emp);;
	}
	
}
