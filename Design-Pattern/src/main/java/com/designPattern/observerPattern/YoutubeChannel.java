package com.designPattern.observerPattern;

import java.util.ArrayList;
import java.util.List;

public class YoutubeChannel implements Subject {
	
	private List<Observer> subscriber = new ArrayList<Observer>();
	@Override
	public void subscribe(Observer ob) {
		this.subscriber.add(ob);
		// TODO Auto-generated method stub
		
	}
	@Override
	public void unsubcribe(Observer ob) {
		// TODO Auto-generated method stub
		this.subscriber.remove(ob);
	}

	@Override
	public void newVideoUpload(String title) {
		// TODO Auto-generated method stub
		for(Observer ob : subscriber) {
			ob.notified(title);
		}
	}
	
}
