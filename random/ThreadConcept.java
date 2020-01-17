package com.random;


public class ThreadConcept implements Runnable{
	
	static int MAX = 20;
	static int num =1;
	int remainder ;
	static Object lock = new Object();
	
	ThreadConcept(int remainder){
		this.remainder = remainder;
	}
	@Override
	public void run() {
		while(num < MAX){
			synchronized (lock) {
				while (num % 2 != remainder){
					try{
						lock.wait();
					}catch(InterruptedException ie){
						ie.printStackTrace();
					}
				}
				System.out.println(Thread.currentThread().getName() + " --> "+num);
				num++;
				lock.notify();
			}
		}
		
	}
	
	
}
