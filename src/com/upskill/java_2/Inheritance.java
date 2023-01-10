package com.upskill.java_2;

public class Inheritance extends MethodType{
	
	/*the process of obtaining the data members and methods from one class to another class is known as inheritance.
	 ---Single Inheritance (parent class--child class)
	 ---Multiple Inheritance (2 parent class and a child class)
	    (Java doesn't support multiple inheritance directly rather through interface).
	 ---Multilevel Inheritance (Grand parent class, Parent class, Child class)
	 */

	public static void main(String[] args) {
		Inheritance obj = new Inheritance();
		obj.annualincome();
		obj.weeklyincome();
		obj.biweeklyincome();
		
		System.out.println("my weekly income is 2500");
	}

}
