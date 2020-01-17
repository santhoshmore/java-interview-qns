package com.random;

public class EvenOdd {
	public static void main(String[] args) {
		
		int []arr = {1,2,3,4,5,6,7,8,9,10};
		
//		System.out.println("odd numbers");
//		for(int i=0;i< arr.length ; i++){
//			if(arr[i] %2 != 0){
//				System.out.println(arr[i] + " ");
//			}
//		}
//		System.out.println("Even numbers : ");
//		for(int i=0; i< arr.length ;i++){
//			if(arr[i] %2 == 0){
//				System.out.println(arr[i] + " ");
//			}
//		}
		
		for(int i=0;i<arr.length;i++){
		System.out.println("print even numbers");
			if(arr[i] %2 ==0 ){
				System.out.println( arr[i]);
			}
			if(arr[i] %2 !=0){
				System.out.println("print odd numbers : "+ arr[i]);
			}
		}
	}
}
