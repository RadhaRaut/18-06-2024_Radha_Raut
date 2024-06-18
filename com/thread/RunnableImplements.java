package com.thread;

public class RunnableImplements implements Runnable{

	

	@Override
	public void run() {
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
