package com.upskill.java_6;

public class Multithreading {
	/* multithreading is a java feature or concept that 
	 allows concurrent execution of two or more parts of a program
	 */
	public static void main(String[] args) {
		int n = 4;
		for (int i = 0; i<n;i++){
			MultithreadingDemo MultithreadingDemoObj = new MultithreadingDemo();
			MultithreadingDemoObj.start();
			
			MultithreadingDemo2 MultithreadingDemo2Obj = new MultithreadingDemo2();
			MultithreadingDemo2Obj.start();
}

	}
}

		class MultithreadingDemo extends Thread{
		public void run(){
		try{
			System.out.println("Thread "+Thread.currentThread().getId() + "is running");
		} catch (Exception e){
			System.out.println("Exception is caught");
		}
	}
}

	class MultithreadingDemo2 implements Runnable{
	public void run(){
		try{
			System.out.println(("Thread" + Thread.currentThread().getId() + "is running"));
		} catch (Exception e){
			System.out.println("Exception is caught");
		}
	}

	public void start() {
		// TODO Auto-generated method stub
		
	}
}
	

