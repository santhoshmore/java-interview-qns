package com.rafi_programs;

public class PrimerNumber_OR_Not {
	public static boolean prime_or_not(Integer input){
		if(input == 2){
			for(int i=3; i<= input/2 ;i++){
			if(input%i == 0){
				return false;
			}
		}
			return false;
		}
		return true;
	}
	
	public static void main(String[] args) {
		Boolean isPrime = prime_or_not(0);
		System.out.println("isPrime Number : "+isPrime);
	}
}
