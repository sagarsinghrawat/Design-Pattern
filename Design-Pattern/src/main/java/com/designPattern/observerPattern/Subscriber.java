package com.designPattern.observerPattern;

public class Subscriber implements Observer {

	private String name;
	public Subscriber(String name) {
		this.name = name;
	}
	@Override
	public void notified(String title) {
		// TODO Auto-generated method stub
		System.out.println("Hello "+this.name+" new video upload : "+title);
		
	}
	
}
