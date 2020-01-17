package com.arrays;

public class String_Example {
	String a ="abcd";
	String b;
	
	public static void main(String[] args) {
		String_Example obj = new String_Example();
		if(obj.a.equals(obj.b)){
			System.out.println("Good");
		}else{
			System.out.println("Bad");
		}
	}
}
// entity, h2, controller -> dao
//  hibernate.template