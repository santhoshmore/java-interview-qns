package com.innerclasses;

public class OuterClassTest {
	public static void main(String[] args) {
		OuterClass outer = new OuterClass();
		OuterClass.InnerClass inner = outer. new InnerClass();
		inner.display_inner_method();
	}

}
