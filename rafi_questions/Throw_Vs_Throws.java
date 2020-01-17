package com.rafi_questions;

public class Throw_Vs_Throws {
	/*
	 **** throw keyword ****
	 # some times we can create exception object explicitly and we can hand over that object to the JVM manually,
	   for this we have to use "throw" keyword
	 # most of the times we use throw keyword for customized exceptions (our own exceptions) but not for predefined exceptions.
	 syntax : throw new ArithmeticException("/ by zero");
	 
	 **** throws ****
	 # In our program, if there is any chance of raising checked exception we should handle that otherwise we will get CE
	 # by using throws keyword we can delegate responsiblity of exception handling to the caller (It may be method or JVM ) then
	   caller is responsible to handle that checked exception
	 # It is required only for CheckedExceptions and usage of throws keyword for unchecked exceptions there is no use.
	 */
}
