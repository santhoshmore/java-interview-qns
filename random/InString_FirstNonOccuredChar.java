package com.random;

public class InString_FirstNonOccuredChar {
	static Integer NO_OF_CHAR = 256;
	static char count[] = new char[NO_OF_CHAR];
	
	/* calculate count of characters  in the passed string */
	
	static void getCountCharArray(String str){
		for(int i=0;i< str.length();i++){
			count[str.charAt(i)]++;
		}
		System.out.println(str.length() );
	}
	/* The method returns index of first non-repeating 
    character in a string. If all characters are repeating  
    then returns -1 */
	static int firstNonRepeating(String str){
		getCountCharArray(str);
		int index= -1,i;
		for(i=0;i<str.length();i++){
			if(count[str.charAt(i)] == 1){  // discuss this with Rafi
				index = i;
				break;
			}
		}
		return index;
	}
	
	public static void main(String[] args) {
		
		String s = "aabcd";
		int index = firstNonRepeating(s);
		System.out.println("first non-occured character is : "+s.charAt(index));
		
	}
}
