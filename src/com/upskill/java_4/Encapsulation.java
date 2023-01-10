package com.upskill.java_4;

public class Encapsulation {

		// used to hide data using setter and getter method
	
		private String name = "upskill";		//write and write
		private int ssn = 4567829 ;				//write only
	    private String username = "khaled ahmad";//read only
		private  int age = 30;
		private String city = "Queens";
		
	    public static void main(String[] args) {
	    	
	    	Encapsulation obj = new Encapsulation();
	    	obj.setName("khaled");
	    	System.out.println(obj.getName());
	    	obj.setSSN(4567829);
	    	obj.getUsername();
	    	obj.setAge(30);
	    	obj.setCity("Queens");
	   
	    	System.out.println(obj.getCity());
	   
	    	System.out.println(obj.getAge());
	    	
	    	System.out.println(obj.getUsername());
	    	
	}
		
		public void setAge( int value){
	    	age = value;			//setter method always void method
	    }
		public int getAge(){
			return age;			//getter method always return type
		}


	    // setter method					// set the data,write
	    public void setName(String value){  //use void method
	    	name = value;
	    }
	    
	    //getter method- name
	    public String getName(){		//return method
	    	return name;
	    }
	    
	    // Setter method = ssn
	    public void setSSN(int value){   //set the data, write only
	    	ssn = value;
	    }
	    // Getter Method - username 
	    public String getUsername(){
	    return username;				// get the data, read only
	    }
	 // setter method					// set the data,write
	    public void setCity(String value){  //use void method
	    	city = value;
	    }
	    
	    //getter method- name
	    public String getCity(){		//return method
	    	return city;
	    }
}
