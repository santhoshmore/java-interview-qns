package com.rafi_programs;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class NonRepeatedCharacter {
	public static void main(String[] args) {
		System.out.println("First Non repeated Character");
		String str ="HCL TECHNOLOGIES";
		List<String> st = Arrays.asList(str.split(""));
		for(String st1 : st){
			
			if(Collections.frequency(st , st1)== 1 && !st1.equalsIgnoreCase(" ")){
				// But I need only first element which is non-repeatable
				System.out.println(st1 + " ");
				break;
			}
		}
	}
}
