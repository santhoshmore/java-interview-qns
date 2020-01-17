package com.rafi_programs;

public class FibonacciSeries {
	/*
	 a series of numbers in which each number ( Fibonacci number ) is the sum of the two preceding numbers.
	 The simplest is the series 1, 1, 2, 3, 5, 8, etc.
	 0 + 1 + 1 + 2 + 3 + 5 + 8 + 13 + 21 + 34 + 
	 */
	
	public static void main(String[] args) {
		//System.out.println(getFibonacci(3));
	        int n = 5, t1 = 0, t2 = 1, sum=0;
	        System.out.print("First " + n + " terms: ");
	        for (int i = 1; i <= n; i++)
	        {
	            System.out.print(t1 + " + ");
	            sum = t1 + t2;
	            t1 = t2;
	            t2 = sum;
	        }
	    }
}
