package com.rafi_programs;

// An immutable class
	
/*
 Following are the requirements:

The class must be declared as final (So that child classes can’t be created)
Data members in the class must be declared as final (So that we can’t change the value of it after object creation)
A parameterized constructor
Getter method for all the variables in it
No setters(not have the option to change the value of the instance variable)
 */


final class  ImmutableClass {
	final String name;
	final int rollNo;
	
	public ImmutableClass(String name, int rollNo) {
		super();
		this.name = name;
		this.rollNo = rollNo;
	}
	public String getName() {
		return name;
	}
	public int getRollNo() {
		return rollNo;
	}
	
	
	
	
}
