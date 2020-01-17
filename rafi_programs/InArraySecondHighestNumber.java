package com.rafi_programs;

public class InArraySecondHighestNumber {

	public static void secondHighestNumber(){
		int[] arr = {14, 46, 47, 86, 92, 52, 48, 36, 66, 85};
		int largest = arr[0];
		int secondLargest = arr[0];
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]+"\t");
		}
		for(int i=0;i<arr.length;i++){
			if(arr[i] > largest ){
				secondLargest = largest ;
				largest = arr[i];
			}else if(arr[i] > secondLargest){
				secondLargest = arr[i];
			}
		}
		System.out.println("\n Second Largest number : "+secondLargest);
	}
	public static void main(String[] args) {

		secondHighestNumber();
	}

}
