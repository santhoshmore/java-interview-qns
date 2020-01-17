package com.rafi_programs;

public class FindDiffBetweenValues {
	public static void main(String[] args) {
		int [] arr = {100,200,8,10,44,29};
		// first two values difference 2-1, 4-3, 
		// first < second
		int value =0;
		int greaterValue = 0;
		for(int i=0;i<arr.length-1;i++){
			
			if(arr[i]<arr[i+1]){
				value=arr[i+1]-arr[i];
				if(value > greaterValue){
					greaterValue = value;
				}
			}
		}
		System.out.println(greaterValue);
	}
}
