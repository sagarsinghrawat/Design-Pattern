package com.designPattern.AbstractFactoryMethod;

public class WebFactory extends EmployeeAbstractFactory{
	
	public Employee createEmployee() {
		return new WebDeveloper();
	}
}
