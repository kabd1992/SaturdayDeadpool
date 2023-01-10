package com.upskill.java_6;

public class Exception_TryCatchFinally {
	
	/*Java handles Exception using TRY-CATCH-FINALLY Block.
	  2 types of Exception:  1.Built-in Exception
	 						 2.User-Defined Exception
	 ***1. Built-in Exception- which are built in or made by java
	 		ArithmaticException/ArrayIndexOutofBound/ClassNotFount/FileNotFound/
	 		Input-Output/RunTime/NullPoint/NoSuchField/NoSuchMethod/Interrupted/		
	 ***2. User-Defined Exception: User can create exception where 
	     the error situation not covered by Java.*/

	public static void main(String[] args) {
		try{
			int[] ageGroup = new int[]{23,25,35, 30, 22};
			System.out.println("Student Age = "+ ageGroup[8]);
			}catch (Exception e){
				System.out.println("Array Index not available");
				e.printStackTrace();
		
		}
		//specific Built-in Exception - NumberFormatException
		try{
			int num = Integer.parseInt("50");
			System.out.println("Value of num int = "+ num);
		}catch(NumberFormatException e){
			System.out.println("please enter a valid number");
			e.printStackTrace();
		}
		
		// User-Defined Exceptions
		try{
			throw new MyException("Test");
		}catch (MyException e){
			System.out.println("User defined exception");
			e.printStackTrace();
		}
		finally {
			System.out.println("Test Execution Completed");
		}
	}
	
}
		
		
	


