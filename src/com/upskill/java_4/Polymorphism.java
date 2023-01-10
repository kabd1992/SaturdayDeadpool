package com.upskill.java_4;

import com.upskill.java_2.MethodType;

public class Polymorphism extends MethodType{
/*ability of an object to take many form,same object acting in different situation/
 * same method with different signature
	-method overloading/compile type/static binding
	-method overriding/Runtime/dynamic binding 
*/
	public static void main(String[] args) {
		car();
		car(1000);
		car("Moon");
		car("runsfirst");
		car( 6, "single");
				
		Polymorphism obj = new Polymorphism();
		obj.annualincome();
	}
		public void annualincome(){
			System.out.println("My annual income is = 150000");
		
	}
	public static void car(){					//method overloading/compile type overloading/static binding
		System.out.println("My car is toyota");
}
	public static void car(int hp){
		System.out.println( "My car is tesla |" + "It has engine:" + hp);
	}
	
	public static void car (String roof){
		System.out.println("My car is BMW |"  + "It has roof :" + roof);
	}
	
	public static void car(int battery, String motor){
		System.out.println("my car is tesla |" + "it has battery :" + battery + " it has motor :" + motor);
	}
	////-method overriding/Runtime/dynamic binding
	}