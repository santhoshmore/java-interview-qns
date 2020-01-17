package com.linkedIn_questions;

public class InterfaceCheck implements One, Two{
	public void method(){
		System.out.println("printing the method");
	}
	
	public static void main(String[] args) {
		InterfaceCheck check = new InterfaceCheck();
		check.method();
	}
}
