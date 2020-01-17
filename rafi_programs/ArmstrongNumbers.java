package com.rafi_programs;

public class ArmstrongNumbers {
	/*
	 Armstrong number is a number that is equal to the sum of cubes of its digits. For example the number 153 = 1cube+5cube +3cube
	 = 1 + 125 + 27 => 153
	 */
	public static boolean getArmstrongNumber(Integer originalNumber){
		int size = originalNumber.toString().length();
		int result = 0;
		int tempNumber = originalNumber;
		int remainder = 0;
		for(;tempNumber !=0; tempNumber /=10){
			remainder = tempNumber%10;
			result += Math.pow(remainder, size);
		}
		return originalNumber ==result;
	}
	
	public static void main(String[] args) {
		 Boolean isBoolean = getArmstrongNumber(153);
		 System.out.println("Entered number is a ArmstrongNumber : "+ isBoolean);
	}
}
