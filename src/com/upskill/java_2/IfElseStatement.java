package com.upskill.java_2;

public class IfElseStatement {
	
	//conditional statements

	public static void main(String[] args) { 								//for unknown data we use if,else
	
		int age = 110;
		if (age <13){
			System.out.println("you are children !");
		} else if (age > 13 && age <18){
		
			System.out.println("you are teeneger !");
		}
			else if(age>=60){
				if (age>=100){
					System.out.println("you are champion !");
				}	else
				
				System.out.println("you are senior !");
			} else{
				System.out.println("you are adult !");
			}
		
		
		
		int grade1 = 90;
				if(grade1>90){
					System.out.println("you are bossA");
				}
				else if (grade1>75){
					System.out.println("you are goodB");
				}
				else if(grade1>65){
					System.out.println("you are okayC");
				}

	}

}
