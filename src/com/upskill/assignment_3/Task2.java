/*Write a java program which will display 5 employee information
   (name, age, salary and address).
 */

package com.upskill.assignment_3;

import java.util.HashSet;
import java.util.Hashtable;

public class Task2 {

	public static void main(String[] args) {
		HashSet<String> employee = new HashSet<String>();
		
		employee.add("khaled");
		employee.add("fahim");
		employee.add("razzak");
		employee.add("shishir");
		employee.add("zaman");
		
		
	System.out.println("name of the employees are:"+employee);
	HashSet<Integer> employees = new HashSet<Integer>();
	employees.add(34);
	employees.add(30);
	employees.add(30);
	employees.add(24);
	employees.add(22);
	System.out.println("age of the employees are "+employees);
	}

}
