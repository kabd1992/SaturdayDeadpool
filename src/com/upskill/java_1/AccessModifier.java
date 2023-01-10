package com.upskill.java_1;

public class AccessModifier {

	public static void main(String[] args) {
	String name = "Rasel";           //public   // any class can access
	int age = 30;                    //private  // only same class can access
	int ssn = 12345;               // protected  //classes in the same package and subclasses
	String address = "heritage tower"; //default  // classes from same package can access
		
		System.out.println(name);
		System.out.println(age);
		System.out.println(ssn);
		System.out.println(address);

	}

}
