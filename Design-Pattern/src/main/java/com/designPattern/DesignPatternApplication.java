package com.designPattern;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Constructor;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.designPattern.AbstractFactoryMethod.AndroidFactory;
import com.designPattern.AbstractFactoryMethod.Employee;
import com.designPattern.AbstractFactoryMethod.EmployeeFactory;
import com.designPattern.AbstractFactoryMethod.ManagerFactory;
import com.designPattern.AbstractFactoryMethod.WebFactory;
import com.designPattern.builderPattern.User;
import com.designPattern.prototypePattern.NetworkConnection;


/*import com.designPattern.factoryMethod.Employee;
import com.designPattern.factoryMethod.EmployeeFactory;*/


//@SpringBootApplication
public class DesignPatternApplication {

	public static void main(String[] args) throws Exception  {
		
		/*--------------------------------Singleton Pattern-----------------------------------------------------*/
		/*
		 * SpringApplication.run(DesignPatternApplication.class, args);
		 * 
		 * System.out.println(Employee.getEmployee().hashCode());
		 * System.out.println(Employee.getEmployee().hashCode());
		 */
		
		/*Breaking of singleton Pattern*/
		/*
		 * 1. By Reflection API we can break singleton Pattern -> Make constructor visible at runtime.
		 * 		
		 * 	  Solution -> a).throw exception from constructor;
		 * 				  b). Use Enum instead of class	
		 * 
		 * 2. By Serialization and Deserialization of the object
		 * 	 Solution -> implements readResolve method
		 * 
		 * 
		 *  3. By Cloning the Object
		 *   Solution -> Override clone method
		 *
		 * */
		
		/*-------------------------Reflection API-----------------------------------------
		 * Employee e1 = Employee.getEmployee();
		 * System.out.println(e1.hashCode());
		 * Constructor<Employee> constructor = Employee.class.getDeclaredConstructor();
		 * constructor.setAccessible(true);
		 * Employee e2 = constructor.newInstance();
		 * System.out.println(e2.hashCode());
		*/
		
		/*---------------------Enum solution for Reflection API---------------------------
		 * Employee e1 = Employee.instance; System.out.println(e1.hashCode());
		 * e1.show(); 
		 * Employee e2 = Employee.instance;
		 * System.out.println(e2.hashCode()); 
		 * e2.show();
		 */
		
		
		/*-------------------------Serialization and Deserialization-----------------------
		 * Employee e1 = Employee.getEmployee();
		 * System.out.println(e1.hashCode());
		 * ObjectOutputStream ob1 = new ObjectOutputStream(new FileOutputStream("abc.ob"));
		 * ob1.writeObject(e1);
		 * 
		 * ObjectInputStream ob2 = new ObjectInputStream(new FileInputStream("abc.ob"));
		 * Employee e2 = (Employee)ob2.readObject();
		 * System.out.println(e2.hashCode());
		*/
		
		/*---------------------------Cloning-------------------------------------------
		 * Employee e1 = Employee.getEmployee();
		 * System.out.println(e1.hashCode());
		 * 
		 * Employee e2 = (Employee)e1.clone();
		 * System.out.println(e2.hashCode());
		*/
		
		
		
		/*************************************************Factory Method**************************************************************/
		
		/*
		 * Employee e1 = (Employee)EmployeeFactory.getEmployee("Android Developer");
		 * System.out.println(e1.salary());
		 * 
		 * Employee e2 = (Employee)EmployeeFactory.getEmployee("Web Developer");
		 * System.out.println(e2.salary());
		 */
		
		/**************************************************Abstract Factory Method*******************************************************/
		/*
		 * Employee e1 = EmployeeFactory.getEmployee(new AndroidFactory());
		 * e1.showName();
		 * 
		 * Employee e2 = EmployeeFactory.getEmployee(new WebFactory()); e2.showName();
		 * 
		 * Employee e3 = EmployeeFactory.getEmployee(new ManagerFactory());
		 * e3.showName();
		 */		
		
		/**************************************************Builder Pattern*******************************************************/
		/**************************************************IMPORTANT*******************************************************/
		
		User user = new User.UserBuilder()
							.setUserEmailId("sagar@gmail.com")
							.setUserId("sagar123")
							.setUserName("sagar")
							.build();
		System.out.println(user);
		
		User user2 = User.UserBuilder.builder().setUserEmailId("ankit@gmail.com").setUserName("ankit").build();
		System.out.println(user2);
		
		
		/**************************************************Prototype Pattern*******************************************************/
		NetworkConnection networkConnection = new NetworkConnection();
		networkConnection.setIp("192.168.0.1");
		networkConnection.loadImportantData();
		System.out.println(networkConnection);
		
		NetworkConnection networkConnection2 = (NetworkConnection)networkConnection.clone();
		System.out.println(networkConnection2);
	}

}
