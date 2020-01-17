package com.rafi_programs;

public class StringPrgm_Evoke_tech {
	
	public static void main(String[] args) {
		String s = "HYDERABAD";
		String s1="H";
		for(int i=1;i<s.length();i++)
		{
		if(i%2==0)
		s1= s1+s.charAt(i);
		else
			s1=s.charAt(i)+s1;
		}
		System.out.println(s1);
	}
}

// HashMap<Employee, Salary> testMap ..... 10 Emp names