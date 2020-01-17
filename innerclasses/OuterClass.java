package com.innerclasses;

public class OuterClass {
	private int x = 20;
	
	class InnerClass{
		public void display_inner_method(){
			System.out.println("inner class method....");
		}
	}
	
	public void callPrivateClass(){
		OuterClass outer = new OuterClass();
		
	}

}

