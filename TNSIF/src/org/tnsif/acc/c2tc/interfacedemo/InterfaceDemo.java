package org.tnsif.acc.c2tc.interfacedemo;

class SmartLight implements SmartDevice{

	@Override
	public void turnOn() {
		System.out.println("SmartLight is On");
	}
	@Override
	public void turnOff() {
		System.out.println("SmartLight is Off");	
	}
	@Override
	public void standbymode() {
		System.out.println("SmartLight is Standbymode");	
	}
}
public class InterfaceDemo {
	public static void main(String[] args) {
		SmartDevice smart=new SmartLight();
		smart.turnOn();
	    smart.turnOff();
	    smart.standbymode();
	}
}
