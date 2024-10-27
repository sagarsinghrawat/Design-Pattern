package com.designPattern.adapterDesignPattern;

public class AdapterCharger implements AppleCharger{

	
	private AndroidCharger androidCharger;
	
	
	public AdapterCharger(AndroidCharger androidCharger) {
		this.androidCharger = androidCharger;
	}

	@Override
	public void chargeApplePhone() {
		// TODO Auto-generated method stub
		this.androidCharger.chargeAndroidPhone();
		
	}
	
}
