package com.upskill.java_3;

public class JavaLoops {
	
	//For Loops
	//While loops
	//Do while
	//Infinite loops

	 	public static void main(String[] args){
	 		practiceForLoop();
	 		practiseWhileLoop();
	 		practiseDoWhileLoop();
	 		practiseInfiniteLoop();
	 		nestedWhileLoop();
	 	}
	 				//FOR LOOP
		public static void practiceForLoop(){ 
										//for Loop keeps doing until reached upper limit
			int i;						// by setting lower limit, upper limit and increment or decrement.
			for(i=1; i<=100; i++) {		// As example like you are running for 1 hour/for specific time limit.
				System.out.println("For Loops Number= "+i);
			}
		}			//FOR LOOP
		public static void practiseWhileLoop(){
			int i= 95;				//while loop is doing again and again until the condition match
			while( i<=100){			// we set the condition with increment or decrement
			i++;					// as example you will be running until the sunset/until the condition reached
			System.out.println("While Loop= "+i);
			}
		}
					//DO WHILE LOOP
			public static void practiseDoWhileLoop(){  // set the condition first then we check the action
				int i= 1;							// like you will be running then you will check it's sunset or not
				do{										
					System.out.println("Do While Loop= "+i);
				}
					while(i>=0);						
}
					//INFINITE LOOP
		public static void practiseInfiniteLoop(){
			int i;
			for(i=1; ; i++){		// never ending loop
			}
			}
					//NESTED WHILE LOOP
		public static void nestedWhileLoop(){
													// One loop inside another loop
			int i;
			int j;
			for(i=1; i<=10; i++);
			for(j=1; j<=10; j++);
					int multiplicationTable =  i*j ;
					
					System.out.println(multiplicationTable  + " " );  //statement for loop 2
		}
					

		{		System.out.println(" ");						//statement for loop 1
     }
}
