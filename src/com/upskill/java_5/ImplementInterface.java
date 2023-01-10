package com.upskill.java_5;

public class ImplementInterface {

	public void iDoor() {
		int door = 4;
		System.out.println("my car's door = "+door);
		
	}

	public void iSeat() {
		int seat = 4;
		System.out.println("my car seat = "+seat);
	}

	public void iWheel() {
		int wheel = 4;
		System.out.println("my car wheel = "+wheel);
		
	}

	public void iRadio() {
		int radio = 1;
		System.out.println("Radio = "+radio);
	}
	public static void main(String[]args){
		ImplementInterface obj = new ImplementInterface();
		obj.iDoor();
		obj.iWheel();
		obj.iRadio();
		obj.iSeat();
	}

}

