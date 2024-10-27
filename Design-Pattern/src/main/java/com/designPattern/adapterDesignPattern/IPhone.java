package com.designPattern.adapterDesignPattern;

public class IPhone {
	
	private AppleCharger appleCharger;
	
	public IPhone(AppleCharger charger) {
		this.appleCharger = charger;
	}
	
	public void chargeIphone() {
		appleCharger.chargeApplePhone();
	}
}
