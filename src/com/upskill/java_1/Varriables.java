package com.upskill.java_1;

public class Varriables {

	String country = "USA";                   //Instance or global: variables declares in class level, outside method
	
	static String name = "Khaled";            // Static: belong to class don't required creating object.
	
	public static void main(String[] args) {
	 
		String city = "Michigan";            //Local variables: variables declared in methods
		
		System.out.println(name);
		
		
		Varriables obj = new Varriables();   // creating object
		
		
		System.out.println(obj.country);

		method2("Queens");
						
	}
			public static void method2(String county){  //method parameter: variable used as a parameter, pass value.
				
				String city = "county";
				System.out.println(county);
								 
			}				

	}


