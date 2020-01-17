package com.company;

public class ClassB {
	ClassA classA = new ClassA();;
	public void b_method() throws ClassNotFoundException{
		classA.a_method();
		System.out.println("classB b_method()");
	}
}
