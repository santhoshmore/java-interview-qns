package com.java8;

public class Diff_bw_AnonymousInnerClass_LambdaExpression {
	/*
	 **** AnonymousInnerClass *****
	 1. It is a class without name
	 2. Anonymous inner class can extend abstract and concrete classes
	 3. Anonymous inner class can implement an interface that contains any no of abstract methods
	 4. Inside Anonymous inner class, we can declare instance variables
	 5. Inside Anonymous inner class, this always refers current anonymous inner class object but not outer class object
	 6. Anonymous inner class can be instantiated
	 7. Anonymous inner class is best choice if we want to handle multiple methods
	 8. Anonymous inner class, at the time of compilation a separate .class file will be generated.
	 9. Memory will be allocated on demand whenever we are creating an object
	 
	 **** Lambda Expression ****
	 1. It is a function without name ( Anonymous function )
	 2. Lambda-expression can't extend abstract and concrete classes
	 3. Lambda-expression can implement an interface which contain single abstract method ( Functional Interface )
	 4. Inside Lambda-expression we can't declare instance variables, whatever variables declared are considered as local variables
	 5. Lambda-expression can't be instantiated
	 6. Inside Lambda-expression, "this" always refers current outer class object i.e enclosing class object
	 7. Lambda-expression is best choice if we want handle the interface with Single Abstract Method (Functional Interface)
	 8. For the Lambda-expression, at the time of compilation no separate .class file will be generated.
	 9. Lambda-expression will reside in permanent memory of JVM (Method Area)
	 
	 */
}
