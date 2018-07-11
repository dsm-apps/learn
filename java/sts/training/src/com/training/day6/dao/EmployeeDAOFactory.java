package com.training.day6.dao;

public class EmployeeDAOFactory {

	public EmployeeDAO createEmployeeDAO() {
		
		/**
		 * For simplicity we have hard coded the name of the concrete class.
		 * You may use the class name from external source like text file and use java.lang.Class to load the concrete subclass.
		 * 
		 * Similar to the commented example below.
		 */
		
		/*
		String name = "com.example.dao.EmployeeDAOMemoryImpl";
		Class clazz = Class.forName(name);
		EmployeDAO dao = (EmployeeDAO) clazz.newInstance();
		*/
		
		return new EmployeeDAOMemoryImpl();
	}
	
}
