package com.arrays;

import java.util.Arrays;
import java.util.Collections;

public class Arrays_Program {
	// print first two numbers which are equal to 10
	public static void getTen(){
		int[] a = {5,3,1,7,9};
		int first =0;
		int second =0;
		for(int i=0 ;i<a.length;i++){
			for(int j=i+1;j< a.length;j++){
				if(a[i]+a[j] == 10){
					first = a[i];
					second = a[j];
					i= a.length;
					System.out.println(i +" "+j);
					break;
				}
			}
		}
		System.out.println("first value : "+ first +" " + "second value : "+second);
	}
	
	public static void main(String[] args) {
		getTen();
	}

}

// string example