package com.designPattern.singleton;

import java.io.Serializable;

public class Employee implements Serializable,Cloneable {
	
	private static Employee employee;
	//make constructor private, so that no one can invoke the employee constructor and create object
	private Employee() {
		
		/*
		 * Solution of Reflection API from breaking the singleton Pattern
		 * if( employee != null ) {
				throw new RuntimeException("you are trying to break singleton pattern");
		   }
		 * 
		 * */
		
	}
	
	//method is static of return type Employee, so that method can invoke without create the object
	//lazy way of creating the object (means, when the client need an object then we create it, before that object won't be create)
	public static Employee getEmployee() {
		
		/*
		 * Thread safe is not there.
		 * Multiple thread can invoke the below code simultaneously and it breaks the singleton pattern
		 * if( employee == null ) {
		 * 		employee = new Employee();
		   }
			return employee;
		*/
			
		
		
		/*
		 by using the synchronized block we can achieve singleton pattern
		 so that object will only once in the lifetime, even multiple thread will invoke the below
		 code simultaneously
		 */ 
		if( employee == null ) {
			synchronized (Employee.class) {
				if( employee == null ) {
					employee = new Employee();
				}
			}
		}
		
		return employee;
	}
	
	
	/* Solution for Serialization and Deserialzation of object
	 * so that it won;t break singleton pattern
	 * public Object readResolve() { return employee; }
	 */
	
	
	/* Solution for not to break singleton pattern by cloning method
	 * @Override public Object clone() throws CloneNotSupportedException { return
	 * employee; }
	 */
}

/*Solution for not to break singleton class using enum
 * public enum Employee { instance;
 * 
 * public void show() { System.out.println("show method called"); } }
 */