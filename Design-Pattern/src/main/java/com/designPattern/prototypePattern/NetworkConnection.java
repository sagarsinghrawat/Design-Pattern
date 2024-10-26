package com.designPattern.prototypePattern;

public class NetworkConnection implements Cloneable {
	
	private String ip;
	private String importantData;
	
	public String getIp() {
		return ip;
	}
	public void setIp(String ip) {
		this.ip = ip;
	}
	public String getImportantData() {
		return importantData;
	}
	public void setImportantData(String importantData) {
		this.importantData = importantData;
	}
	@Override
	public String toString() {
		return "NetworkConnection [ip=" + ip + ", importantData=" + importantData + "]";
	}
	
	
	public void loadImportantData() throws InterruptedException{
		this.importantData = "very very important Data";
		Thread.sleep(5000);
	}
	@Override
	public Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
	
	
	

}
