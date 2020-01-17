package com.rafi_programs;

public class ReverseGivenInput {
	
	public static Object getReverse(Object input){
		if(input instanceof String){
			return new StringBuilder(input.toString()).reverse().toString();
		}
		if(input instanceof Integer){
			return Integer.valueOf(new StringBuilder(input.toString()).reverse().toString());
		}
		return null;
	}
	
	public static void main(String[] args) {
		Object obj = new Object();
		obj = new String("micheal");
		String str = "Hayabiusa";
		String string = (String) getReverse(obj);
		System.out.println(getReverse(str));
		System.out.println(string);
		
		obj = new Integer(334242);
		//getReverse(obj);
		System.out.println(getReverse(obj));
	}
}
