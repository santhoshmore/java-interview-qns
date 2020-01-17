package com.nisum;

public class Thread_Topic {
	
	public static void main(String[] args) {
		System.out.println("main thread is- "+ Thread.currentThread().getName());
		Thread t1 = new Thread(new Thread_Topic().new RunnableImpl());
		t1.start();
	}
	private class RunnableImpl implements Runnable{
		@Override
		public void run() {
			 System.out.println(Thread.currentThread().getName() + "' executing run method");
		}
	}
}
