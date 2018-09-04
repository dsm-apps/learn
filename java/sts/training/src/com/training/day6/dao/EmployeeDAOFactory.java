package com.training.day6.dao;

public class EmployeeDAOFactory {

	static EmployeeDAO dao = null;
	
	public static EmployeeDAO createEmployeeDAO() {
		
		/**
		 * For simplicity we have hard coded the name of the concrete class.
		 * You may use the class name from external source like text file and use java.lang.Class to load the concrete subclass.
		 * 
		 * Similar to the commented example below.
		 */
		
		if(dao != null) {
			return dao;
		}
		
		try {
			String name = "com.example.dao.Hibernate";
			Class clazz = Class.forName(name);
			 dao = (EmployeeDAO) clazz.newInstance();
		} catch (Exception e) {

		}
		
		return dao;
		
		
		//return new EmployeeDAOMemoryImpl();
	}
	
}
