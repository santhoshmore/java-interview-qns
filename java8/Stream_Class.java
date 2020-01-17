package com.java8;
import java.util.Arrays;
import java.util.List;

public class Stream_Class {

		public static void main(String[] args) {
			List<Integer> list = Arrays.asList(1,2,4,5,8);
			// filter() method of Stream interface
			list.stream().filter(num -> num /5 ==0).forEach(System.out::println);
			
			//map() method of Stream interface
			list.stream().map(num -> num+1).forEach(System.out::println);
		}


//	public static void main(String[] args) 
//	{ 
//		// Creating a list of Integers 
//		List<Integer> list = Arrays.asList(3, 4, 6, 12, 20); 
//
//		// Using Stream filter(Predicate predicate) 
//		// to get a stream consisting of the 
//		// elements that are divisible by 5 
//		list.stream().filter(num -> num % 5 == 0).forEach(System.out::println);
//	} 
}
