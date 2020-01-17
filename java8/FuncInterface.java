package com.java8;

public interface FuncInterface {
	
	 void funMethod(int x);
	 
	 default void normalFun(){
		 System.out.println("Normal default method....");
	 }

}
