package com.designPattern.iteratorPattern;

import java.util.List;

public class MyIteratorImpl implements MyIterator{
	
	private List<User> list;
	private int length;
	private int positon = 0;
	
	public MyIteratorImpl(List<User> list) {
		this.list = list;
		this.length = list.size();
	}
	
	@Override
	public boolean hasNext() {
		// TODO Auto-generated method stub
		if(positon >= length) {
			return false;
		}
		return true;
	}

	@Override
	public Object next() {
		// TODO Auto-generated method stub
		User user = this.list.get(positon);
		this.positon +=1;
		return user;
	}

}
