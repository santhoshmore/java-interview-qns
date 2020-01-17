package com.arrays;

import java.util.Arrays;

public class SingleDimensionalSorting {
	public void sortArrays(){
		int [] arr = {23,56,123,99,45,34,26,98};
		Arrays.sort(arr);
		System.out.println("modified array : "+Arrays.toString(arr));
	}
	public static void main(String[] args) {
		SingleDimensionalSorting obj = new SingleDimensionalSorting();
		obj.sortArrays();
	}
}
