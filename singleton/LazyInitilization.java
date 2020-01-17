package com.singleton;

public class LazyInitilization {
	// private static instance
	private static  LazyInitilization singleton;
	// private constructor
	private LazyInitilization(){}
	
	// checking static instantiation
	public static LazyInitilization getInstance(){
		if(singleton == null){
			singleton = new LazyInitilization();
		}
		return singleton;
	}
	
}
