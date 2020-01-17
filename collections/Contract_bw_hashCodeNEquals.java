package com.collections;

public class Contract_bw_hashCodeNEquals {
	
	/*
	 Two equivalent objects should be placed in same bucket
	 1. If two objects are equal by .equals() method then their hashCode must be equal i.e two equivalent objects should have same
	    hashCode i.e if  r1.equals("r2") then r1.hashCode == r2.hashCode is always true.
	 
	 **** some more info ****
	 
	 # If .equals() & hashCode() is override then Object class .equals() & hashCode() methods will be called
	 # Object .equals() & hashCode() method follows above contract, hence whenever we are overriding .equals() compulsory we should
	   override hashCode() to satisfy above contract. (i.e two equivalent objects should have same hashCode )
	 */

}
