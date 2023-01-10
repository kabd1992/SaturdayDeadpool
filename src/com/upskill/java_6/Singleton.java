package com.upskill.java_6;

public class Singleton {
	
	// Singleton is class that can have only one object
	//we create the constructor private
	//we make the object private
	// and provide a static private get instance method
	// Private constructor, It prevents any other class from instantiating
	private Singleton(){
		
	}
	// Private static object of the class
	private static Singleton SingletonObj = new Singleton();
		
	
	// Static instance method
	public static Singleton getInstance() {
		return SingletonObj;
		}
	protected static void demo(){
		System.out.println("Demo for singleton");
	}

}
