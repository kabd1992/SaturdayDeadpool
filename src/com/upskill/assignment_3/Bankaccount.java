/*
 Write a class name BankAccount which has savings and checking class. 
 BankAccount class that has a name and an initial amount, 
 which are both set in the constructor. Also, it lets users make deposits. 
 Note that the account name must be set when an account is created. 
 Demonstrates the account class hierarchy with output of:
 */
package com.upskill.assignment_3;

import java.util.HashMap;

public class Bankaccount {

	public static void main(String[] args) {
		
		String name = "savings";
		System.out.println("account name: "+name);
		
		HashMap<String, Integer> deposit = new HashMap< String , Integer>();
		deposit. put("saving", 10000);
		deposit.put("afterdeposits", 15000);
		System.out.println("initial amount: "+deposit.get("saving"));
		System.out.println("new amount after deposit:"+deposit.get("afterdeposits"));
		
		String name1 = "checking";
		System.out.println("account name: "+name1);
		
		deposit.put("checking", 20000);
		deposit.put("afterdepositch", 2600);
		deposit.put("withdrawal", 23000);
		
		System.out.println("initial amount: "+deposit.get("checking"));
		System.out.println("new amount after deposit: "+deposit.get("afterdepositch"));
		System.out.println("new amount after withdrawal "+deposit.get("withdrawal"));
		
		
	}

}
