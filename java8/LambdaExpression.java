package com.java8;

public class LambdaExpression{
	/*
	**** What is Lambda Expression (λ) ****
Lambda Expression basically express instances of functional interface. Lambda expression implement only abstract function and
 therefore implement functional interface. That means the function which doesn’t have the return type and access modifiers.

   **** Benefits of Lambda Expression ****
	# To enable functional programming in java
	# write more readable, maintainable & concise code
	# To use API's very easily & effectively.

 **** Important points ****

The body of a lambda expression can contain zero, one or more statements.
When there is a single statement curly brackets are not mandatory and the return type of the anonymous function is the same as
 that of the body expression.
When there are more than one statements, then these must be enclosed in curly brackets (a code block) and the return type of the
 anonymous function is the same as the type of the value returned within the code block, or void if nothing is returned.
	 */

	public static void main(String[] args) {
		FuncInterface fobj = (int x)->System.out.println("Functional Interface method called...."+x);
		fobj.funMethod(456);
	}
}
