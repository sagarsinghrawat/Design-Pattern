package com.designPattern.AbstractFactoryMethod;

public class ManagerFactory extends EmployeeAbstractFactory {
	
	public Employee createEmployee() {
		return new Manager();
	}
}
