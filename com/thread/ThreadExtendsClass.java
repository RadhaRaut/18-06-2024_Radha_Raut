package com.thread;

public class ThreadExtendsClass extends Thread 
{
	
	public ThreadExtendsClass() {
		
	}
//overrides java.lang.Thread.run
	public void run() {
		//System.out.println("thread running");
		
		//System.out.println(Thread.currentThread());
		
//		for(int i =1 ; i<=10; i++) {
//			System.out.println(i);
//		}
		
//		for(int i =1 ; i<=10; i++) {
//			System.out.println(Thread.currentThread()+ " : "+ i);
//		}
		
		for(int i =1 ; i<=100; i++) {
			System.out.println(Thread.currentThread()+ " : "+ i);
			try {
				Thread.sleep(10); //1 milli sec= 
			}
			catch(Exception e) {
				e.getStackTrace();
			}
		}
	}

}
