package com.company;

public class ClassC {
	ClassB classB = new ClassB();;
	public void c_method(){
		classB.b_method();
		System.out.println("c_method() from C-class");
	}
	public static void main(String[] args) {
		ClassC c = new ClassC();
		c.c_method();
	}

}
