package com.designPattern.observerPattern;

public interface Subject {
	
	public void subscribe(Observer ob);
	public void unsubcribe(Observer ob);
	public void newVideoUpload(String title);

}
