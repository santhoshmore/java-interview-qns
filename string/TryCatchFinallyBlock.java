package com.string;

public class TryCatchFinallyBlock {
	static int getData(){
		try{
			System.out.print(10/0);
			return 1;
		}catch(Throwable tr){
			System.out.println("throwable block....");
			return 2;
		}
		finally{
			System.out.println("finally block...");
			return 3;
		}
	}
	public static void main(String[] args) {
		Integer getValue =getData();
		System.out.println(getValue);
	}
}
