package com.linkedIn_questions;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class List_Class {
	
	public static void checkLinkedList(){
		// for List Insertion order is preserved
		LinkedList<Integer> list = new LinkedList<>();
		list.add(5);
		list.add(1);
		list.add(10);
		System.out.println(list);
	}
	
	public static void checkArrayList(){
		List list = new ArrayList();
		list.add("hello");
		list.add(2);
		System.out.println(list.get(0) instanceof Object);  // true
		System.out.println(list.get(1) instanceof Integer); // true
	}
	
	public static void main(String[] args) {
		checkLinkedList();
	}
}
