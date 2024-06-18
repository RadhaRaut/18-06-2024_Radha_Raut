package com.thread;

public class TestClassRunnable {

	public static void main(String[] args) {
		
		RunnableImplements ex = new RunnableImplements();
		RunnableImplements ex1 = new RunnableImplements();
		
		Thread t1 = new Thread(ex);
		Thread t2 = new Thread(ex1);
		
		t1.setName("Radha the microbiologist");
		t1.setPriority(Thread.MAX_PRIORITY);
		t1.start();
		t2.start();

	}

}
