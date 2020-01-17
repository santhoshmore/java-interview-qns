package com.random;

public class PrintEvenOddThreadMain {
	public static void main(String[] args) {
		ThreadConcept runnable1 = new ThreadConcept(1);
		ThreadConcept runnable2 = new ThreadConcept(0);
		
		Thread t1 = new Thread(runnable1,"Thread 1 : ");
		Thread t2 = new Thread(runnable2,"Thread 2 : ");
		t1.start();
		t2.start();
	}
}
