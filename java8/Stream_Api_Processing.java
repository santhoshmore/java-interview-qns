package com.java8;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Stream_Api_Processing {
	
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		for(int i=0;i<=10;i++){
			list.add(i);
		}
		System.out.println(list);
		
		List<Integer> l= list.stream().filter(num -> num%2 ==0).collect(Collectors.toList());
		System.out.println(l);
	}
}
