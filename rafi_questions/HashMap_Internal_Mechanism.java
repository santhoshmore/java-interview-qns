package com.rafi_questions;

import java.util.HashMap;


public class HashMap_Internal_Mechanism {
	/*
	 1. Underlying datastracture is hashtable
	 2. Initially empty hashMap has size of 16 nodes/buckets (index from 0 to 15)
	 3. When we 
	 
	 HashMap contains an array of Node and Node can represent a class having following objects :
		*. int hash
		*. K key
		*. V value
		*. Node next
		*
   #. capacity = number of buckets * load factor
   
   
	 */
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return super.hashCode();
	}
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return super.equals(obj);
	}
	public static void main(String[] args) {
		HashMap<String, String> hashMap = new HashMap<>();
		hashMap.put("santhosh", "9145738237");
		hashMap.put("santhos", "91457382373");
		hashMap.put("rafi", "9145738237");
		System.out.println("HashMap : "+hashMap +" - "+hashMap.hashCode());
	}
	
}
