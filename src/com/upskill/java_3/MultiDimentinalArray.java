package com.upskill.java_3;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;

public class MultiDimentinalArray {

	public static void main(String[] args) {
		
		int[][] ageUpskill2D = {{25, 21, 35, 30, 40},			 //[0][0] [0][1] [0][2] [0][3] [0][4] [0][5]
				               {21, 25, 22, 26}};                 //[1][0] [1][1] [1][2] [1][3] [1][4] [1][5]
		System.out.println("Student Age 2D : "+ ageUpskill2D[0][3]);
		
		
		String[][] name2D = {{"Fahim", "Razzak", "Zaman", "Tahin","Khaled"},			//[0][0] [0][1] [0][2] [0][3] [0][4] [0][5]
	             {"Hasnat", "vai", "Ahmed", "bro", "Ahmed"}};                           //[1][0] [1][1] [1][2] [1][3] [1][4] [1][5]
System.out.println("Student name 2D : "+ name2D[0][2]);



// HashMap store multiple data using key- value pair, implementation of Map interface

HashMap<String, Integer> Student = new HashMap <String, Integer>();					// HasMap 


Student.put("Tanzu", 22);  //(key,value)
Student.put("Tahin", 21);
Student.put("Masud", 24);
Student.put("Khaled", 30);

System.out.println("HashMap Student Age : "+ Student.get("Khaled"));

																				
HashMap<String, String> Country = new HashMap <String, String>();					
Country.put("USA", "DC");
Country.put("BAN", "DAK");
Country.put("CAN", "MON");
Country.put("IND", "DEL");

System.out.println("HasMap Capital: "+Country.get("BAN"));

	HashSet<String> car = new HashSet<String>();			//HashSet/no duplicate

			car.add("BMW");
			car.add("Toyota");
			car.add("Audi");
			System.out.println("car : "+car);
		
	HashSet<String> capital = new HashSet<String>();						

			capital.add("DC");
			capital.add("Dhaka");
			capital.add("Montrel");
			System.out.println("capital : "+ capital);	
			
	Hashtable<String, String> Region = new Hashtable<String, String>();		//HashTable/no duplicate
			
			Region.put("BD", "Asia");
			Region.put("USA", "America");
			System.out.println("Region : "+Region.get("BD"));
			
	Hashtable<String, String> County = new Hashtable<String, String>();
			
			County.put("Bronx", "Br");
			County.put("Queens", "Queens");
			County.put("Brooklyn", "kings");
			System.out.println("County : "+County.get("Queens"));
			
			
		}

	}


