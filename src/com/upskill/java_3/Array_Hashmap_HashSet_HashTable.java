package com.upskill.java_3;

public class Array_Hashmap_HashSet_HashTable {

	public static void main(String[] args) {
		
		// Array store multiple data using index/variable store one value
		// the syntax is :
		// int[] age/id/number = new int[]{ 14, 45, 102, 203 };
		// String[] city/country/state = new String[]{ "NY", "MI", "FL"};
		
		int[] age = new int[]{ 35, 30, 28, 25, 38};
		String[] nameDeadpool = new String[]{ "Masud", "Tahin", " Razzak", "Tanzu", "Shamme"};
		
		// Array index    [0] [1] [2] [3] [4] 

		
		System.out.println("Total student : "+ nameDeadpool.length);
		System.out.println("Student Name: "+nameDeadpool[3]);
		System.out.println("total count : "+age.length);
		System.out.println("student age: "+age[1]);
	
		
		
		
	}

}
