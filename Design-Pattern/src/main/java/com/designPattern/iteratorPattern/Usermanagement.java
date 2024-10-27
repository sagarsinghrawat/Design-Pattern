package com.designPattern.iteratorPattern;

import java.util.ArrayList;
import java.util.List;

public class Usermanagement {
	
	private List<User> userList = new ArrayList<>();
	
	public void addUser(User user) {
		this.userList.add(user);
	}
	public MyIterator getIterator() {
		return new MyIteratorImpl(this.userList);
	}
	
}
