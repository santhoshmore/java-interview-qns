package com.java8.functional_interface;

/*
 @FunctionalInterface annotation is used to ensure that the functional interface can’t have more than one abstract method.
  In case more than one abstract methods are present, the compiler flags an ‘Unexpected @FunctionalInterface annotation’ message.
   However, it is not mandatory to use this annotation.
   
   If you permit me I'll tell more about Functional Interface
   
   If an interface extends FunctionalInterface and child interface doesn’t contain any abstract method then child interface is
    also FunctionalInterface
    
 */

public class Test {
	public static void main(String[] args) {
		int a =5;
		Square square = (int x) -> x*x;
		int result = square.calculate(a);
		System.out.println(result);
	}
}
