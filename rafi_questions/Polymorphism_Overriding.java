package com.rafi_questions;

public class Polymorphism_Overriding {
	/*
	 When we extends Parent class,What ever the parent has by default availble to child, if child is not satisfied with Parent 
	 implementation then write in own specific way. This process is called overriding, the parent method which is overriden is 
	 called "overidden method", the child method which is overriding is called "overriding method"
	 
	 1. In overriding method name, arguments must me matched, i.e method signature must be matched
	 2. While overriding the return must be same, this rule is applicable until 1.4 version. But from 1.5v co-variant return types are 
	    allowed. According to this child method return type need not be same as parent method return type its child is also allowed
	 3. Private methods are not visible in child classes, hence overriding concept not applicable to private methods
	 4. Parent class final,private,static methods cannot be overriden in child classes.
	 7. we can override var-arg() method with var-arg() method only, if we are trying to override a var-arg() method with normal method
	    then it will become overloading but not overriding.
	 8. Weakering access modifiers are not allowed, but increasing allowed.
	 9. throws clause - the size and level of checked exceptions are not allowed to increase, but we can decrease.
	   
	 */
}
