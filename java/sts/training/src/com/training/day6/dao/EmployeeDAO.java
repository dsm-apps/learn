package com.training.day6.dao;

public interface EmployeeDAO {

	public void add(Employee6 emp);
	public void update(Employee6 emp);
	public void delete(int id);
	public Employee6 findById(int id);
	public Employee6[] getAllEmployees();
	
}
