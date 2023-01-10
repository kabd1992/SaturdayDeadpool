package com.upskill.java_5;

public abstract class AbstractClass {
	
	// Abstract class has both abstract method and regular method.
	
	public abstract void iDoor();// Abstract method
	public abstract void iSeat();
	public abstract void iWheel();
	public abstract void iRadio();

	public void brand(){
		String brand = " Tesla";  //Non-abstract or Regular Method
	}
	public void color(){
		String color = "Black";
	}
	public void engine(){
		int motor = 3;
		System.out.println("Motor = "+motor);
	}
}
