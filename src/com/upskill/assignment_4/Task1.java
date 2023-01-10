package com.upskill.assignment_4;


public class Task1 {

	private String username = "Khaled123";
	private int password = 54321;
	private String email = "kamn1992@gmail.com";
	private String name = "khaled Ahmad";
	
	public static void main(String[] args){
		Task1 obj = new Task1();
		obj.setuserName("khaled123");
		System.out.println(obj.getuserName());
		obj.setPassword(54321);
		System.out.println(obj.getPassword());
		obj.setEmail("kamn1992@gmail.com");
		System.out.println(obj.getEmail());
		obj.setName("Khaled Ahamd");
		System.out.println(obj.getName());
	}


	public void setuserName(String value) {
		 username = value;
	}
	    
	

	public String getuserName(){
		return username;
	}
	public void setPassword( int value){
		password = value;
	}
	public int getPassword(){
		return password;
	}
	
	public void setEmail(String value){
		email = value;
	}
	public String getEmail(){
		return email;
	}
	public void setName(String value){
		name = value;
	}
	public String getName(){
		return name ;
	}
}
