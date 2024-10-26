package com.designPattern.AbstractFactoryMethod;

public class AndroidFactory extends EmployeeAbstractFactory {
	
	public Employee createEmployee() {
		return new AndroidDeveloper();
	}
}
