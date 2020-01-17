package com.string;

/*
  Write a program to compress string (without using map)
  For e.g. input: aaaabbbbbccccaaa     output : a7b5c4
 */
public class StringProgram {
	public static void main(String [] args) {
		//String str = "aaaabbbbbccccaaa";
		String str = "mississippii";
		char[] chars = str.toCharArray();
		int count = 1;
		for (int i = 0; i < chars.length; i++) { 
			for(int j=i+1; j< chars.length ;j++){
				if(chars[j] == chars[i]){
					 chars[j] = '$';
					count ++;
				}
			} 
			if(chars[i] != '$'){
				System.out.print(chars[i]+""+ count);
			}
			count =1;
		} 
	}
}
