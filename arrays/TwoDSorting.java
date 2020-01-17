package com.arrays;

import java.util.Arrays;
import java.util.Comparator;

public class TwoDSorting {
	 // initialize a two dimensional array
    static Integer[][] itemIdAndQty = new Integer[5][2];
    
    public static void main(String[] args) {
		// initialize array values
    	itemIdAndQty[0][0] = 1234;
    	itemIdAndQty[0][1] = 46;
    	itemIdAndQty[1][0] = 5443;
    	itemIdAndQty[1][1] = 3333;
    	itemIdAndQty[2][0] = 232;
    	itemIdAndQty[2][1] = 20;
    	itemIdAndQty[3][0] = 19;
    	itemIdAndQty[3][1] = 39;
    	itemIdAndQty[4][0] = 452;
    	itemIdAndQty[4][1] = 98;
    	System.out.println("before sorting");
    	displayArray();
    	// sort the array on item id(first column)
    	Arrays.sort(itemIdAndQty, new Comparator<Integer[]>() {
			@Override
			//arguments to this method represent the arrays to be sorted  
			public int compare(Integer[] o1, Integer[] o2) {
				//get the item ids which are at index 0 of the array
				Integer itemIdOne = o1[0];
				Integer itemIdTwo = o2[0];
				return itemIdOne.compareTo(itemIdTwo);
			}
		});
    	// display array after sort
    	System.out.println("After sorting on item id in ascending order");
    	displayArray();
    	// sort array on quantity(second column)
    	Arrays.sort(itemIdAndQty, new Comparator<Integer[]>() {
			@Override
			public int compare(Integer[] o1, Integer[] o2) {
				Integer QtyIdOne = o1[0];
				Integer QtyIdTwo = o2[0];
				return QtyIdOne.compareTo(QtyIdTwo);
			}
		});
    	// display array after sort
    	System.out.println("After sorting on quantity in ascending order");
    	displayArray();
	}
    
    
    private static void displayArray(){
    	System.out.println("----------------------");
    	System.out.println("Item Id\t\t Quantity");
    	for(int i=0;i<itemIdAndQty.length; i++){
    		Integer[] itemRecord = itemIdAndQty[i];
    		System.out.println(itemRecord[0]+ "\t\t"+ itemRecord[1]);
    	}
    	System.out.println("----------------------");
    }
 
  
}
