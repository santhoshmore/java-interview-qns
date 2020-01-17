package com.multithreading;

/*
Deadlock describes a situation where two or more threads are blocked forever, waiting for each other. Deadlock occurs when multiple
threads need the same locks but obtain them in different order. A Java multithreaded program may suffer from the deadlock condition 
because the synchronized keyword causes the executing thread to block while waiting for the lock, or monitor, associated with the
specified object.
*/

public class DealLock {
	
	public static Object lock1 = new Object();
	public static Object lock2 = new Object();
	
	public static void main(String[] args) {
		ThreadDemo1 thread1 = new ThreadDemo1();
		ThreadDemo2 thread2 = new ThreadDemo2();
		thread1.start();
		thread2.start();
		// just change the order lock1 -> lock2 (it gives the solution)
	}
	
	private static class ThreadDemo1 extends Thread{
		public void run(){
			synchronized(lock1){
				System.out.println("Thread 1 : Holding lock 1 ......");
				try{
					Thread.sleep(10);
				}catch(InterruptedException ie){}
				System.out.println("Thread 1: waiting for lock 2....");
				
				synchronized (lock2) {
					System.out.println("Thread 1 : Holding lock 1 & 2...");
				}
			}
		}
	}
	
	private static class ThreadDemo2  extends Thread{
		public void run(){
			synchronized(lock1){
				System.out.println("Thread 2: Holding lock 2 ....");
				try{
					Thread.sleep(10);
				}catch(InterruptedException ie){}
				System.out.println("Thread 2 : waiting for lock 1.....");
				
				synchronized (lock2) {
					System.out.println("Thread 2 : Holding lock 1 & 2 ...");
				}
			}
		}
	}
}
