package com.upskill.java_2;
//Method Types
public class MethodType {
	
	/* Types of Method
	 1.Void Method
	 2.Static Method
	 3.Return Type Method
	 */
	
	public static int hourlyincome = 65;    //global variable
	public static int weeklyincome = 2000;
	private static String raselvai;


	
	
	
	public static void main(String[] args) {     
		MethodType obj = new MethodType();    ////main method,anything u want to run, u have to run in main method
		obj.annualincome();                 
			weeklyincome();       //not creating object just declaring
		obj.biweeklyincome();
		
		obj.khaled();
			khaled1();
			
			
			System.out.println("My monthly income = "+obj.monthlyincome());
		

	}
//void method       
	
	public void annualincome(){         
		int calculateannualincome = hourlyincome*2000;
		System.out.println("My Annual Income= "+calculateannualincome);
	}
	
	//static Method
public static void weeklyincome(){     // without calling object
	int calculateweeklyincome = hourlyincome * 40;
	System.out.println("My weeklyincome = "+calculateweeklyincome);
}


//return type method// non-static method
	public int monthlyincome(){
		int calculatemonthlyincome = hourlyincome*180;
		return calculatemonthlyincome;
		
}
	//////////////////////////////////////////////////////////////
	public void biweeklyincome(){         
		int calculatebiweeklyincome = hourlyincome*80;
		System.out.println("My biweekly Income= "+calculatebiweeklyincome);
}
	public static void weeklyincome1(){     // without calling object
		int calculateweeklyincome = hourlyincome * 360;
		System.out.println("My 2monthlyincome = "+calculateweeklyincome);
	
	}	
	
	//Method
	public void khaled(){       //method
		String name = "khaled"; ///variables
			int age = 30;
			System.out.println("My age = "+age);
			System.out.println("My name is "+name);
	}
	
	public static void khaled1(){
		String name = "khaledahmad";
		int age = 30;
		System.out.println(" My name is :"+name);
	}
	
	public static String owner(){
		String owner = "raselvai";
		return owner;
	
}
	
	public static void myage(){   
		int myage = 30;
		System.out.println("My age = "+myage);
}
	public static int weeklyicnome1(){
		int myweeklyincome = 2000;
		return myweeklyincome;
	}
	
	
	
	
	
}