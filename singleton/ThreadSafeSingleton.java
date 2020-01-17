package com.singleton;

public class ThreadSafeSingleton {
	// private static instance
	private static ThreadSafeSingleton instance;
	//private constructor
	private ThreadSafeSingleton(){}
	//here we added 'synchronized' for thread safety
	public static synchronized ThreadSafeSingleton getInstance(){
		if(instance == null){
			instance = new ThreadSafeSingleton();
		}
		return instance;
	}
}
