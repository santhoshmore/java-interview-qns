package com.nisum;

import java.util.ArrayList;
import java.util.List;

public class SubList {
	public static void main(String[] args) {
		//List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25);
		List<Integer> list = new ArrayList<Integer>();
		for(int i=0;i<25;i++) {
			list.add(i);
		}
		int size =5;
		for(int start=0; start< list.size(); start +=size) {
			int end = Math.min(start + size, list.size());
			 List<Integer> sublist= list.subList(start,end);
			 System.out.println(sublist);
		}
	}
}
