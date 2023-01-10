package com.upskill.java_5;

public class ChildAbstractClass extends AbstractClass {

	@Override
	public void iDoor() {
		int door = 4;
		System.out.println("my car's door = "+door);
		
	}

	@Override
	public void iSeat() {
		int seat = 4;
		System.out.println("my car seat = "+seat);
	}

	@Override
	public void iWheel() {
		int wheel = 4;
		System.out.println("my car wheel = "+wheel);
		
	}

	@Override
	public void iRadio() {
		int radio = 1;
		System.out.println("Radio = "+radio);
	}
	public static void main(String[]args){
		ChildAbstractClass obj = new ChildAbstractClass();
		obj.iDoor();
		obj.iWheel();
		obj.iRadio();
		obj.iSeat();
	}

}
