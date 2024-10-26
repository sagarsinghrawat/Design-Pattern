package com.designPattern.AbstractFactoryMethod;

public class Manager implements Employee {
	@Override
	public int getSalary() {
		// TODO Auto-generated method stub
		return 50000000;
	}
	
	@Override
	public void showName() {
		// TODO Auto-generated method stub
		System.out.println("I am manager");
		
	}
}
