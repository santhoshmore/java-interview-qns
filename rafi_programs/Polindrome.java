package com.rafi_programs;

public class Polindrome {
	public static boolean polindrome(Object obj){
		String sb1 = new StringBuilder(obj.toString()).reverse().toString();
		return obj.toString().equals(sb1);
	}
	
	public static void main(String[] args) {
		Integer number = 1221;
		System.out.println(polindrome(number));
	}
}
