package com.nisum;

public class FactorialRecursion {
	public static void main(String[] args) {
		int number = 5;
		int fact = 1;
		fact = factorial(number);
		System.out.println("Factorial of "+number + " is: "+ fact);
	}
	
	static int factorial(int number) {
		if(number == 0)
			return 1;
		else
			return (number*factorial(number-1));
	}
}
