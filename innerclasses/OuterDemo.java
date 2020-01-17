package com.innerclasses;

public class OuterDemo {
	
	class InnerDemo{
		public void print(){
			System.out.println("inner class print()");
		}
	}
		public void display_inner(){
			InnerDemo inner = new InnerDemo();
			inner.print();
		}
	
}
