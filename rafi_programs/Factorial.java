package com.rafi_programs;

public class Factorial {
	
	/*
	 * 4! = 4*3*2*1 = 24 
	 */
	
	public static void main(String args[]){  
		  int i,fact=1;  
		  int number=1;//It is the number to calculate factorial    
		  for(i=1;i<=number;i++){    
		      fact=fact*i;    
		  }    
		  System.out.println("Factorial of "+number+" is: "+fact);    
		 }  
}
