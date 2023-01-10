/*2.  A school conducts a 100 mark exam for its student and grades them as follows:
 	Grade:
 		Grade A: Marks>=90
 		Grade B: Marks>=80-89
 		Grade C: Marks>=70-79
 		Grade D: Marks>=60-69 AND FAIL THEM WHO HAS <60
     Write a java program to calculate the grade for a student in a method passing 
     parameter for grade to display every grade type, using if..else statement.
*/


package com.upskill.assignment_2;

public class Assign2task2 {

	public static void main(String[] args) {
		
	int grade = 90;
	if( grade >=90);{
	System.out.println("Grade A");
	
	}
	
	if (grade >= 80 && grade >=89){
		System.out.println("Grade B");
	}
	
	else if ( grade >=70 && grade >=79){
		System.out.println("Grade C");
	}
	else if ( grade >=60 && grade <=69);
		System.out.println("Grade D");
	}

	
public static void methodpass(int grade){
	String gradetype = "grade";
	System.out.println("Grade A");
	System.out.println("Grade B");
	System.out.println("Grade C");
	System.out.println("Grade D");
}
	
}
