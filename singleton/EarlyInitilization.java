package com.singleton;

/*
 Instead of creating multiple objects for same requirement,just create only one object use the same object for that.
 */

public class EarlyInitilization {
	// static instantiation
	private static EarlyInitilization instance = new EarlyInitilization();
	//private constructor
	private EarlyInitilization(){}
	
	// static method
	public static EarlyInitilization getInstance(){
		return instance;
	}
}
