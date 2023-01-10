/*
  Bank is a class that provides functionality to get 
  interest rate. Display different interest rate 
  using rate functionality for Chase, City and TD banks 
  followed by 8%, 7% and 9%. 
  Hints: using method override.
 */
package com.upskill.assignment_3;

public class Task3 extends Bankaccount {  // also task 4 runtime polymorphysm

	public static void main(String[] args) {
		Task3 obj = new Task3();
		obj.interestRate();
		obj.interestRate1();
		obj.interestRate2();

	}
	public void interestRate(){
		System.out.println( "Chase bank's interest rate is = 8%");
	}
	public void interestRate1(){
		System.out.println( "City bank's interest rate is = 7%");
}
	public void interestRate2(){
		System.out.println( "TD bank's interest rate is = 9%");
}
}