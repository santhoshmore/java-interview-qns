package com.java8;

import java.util.function.Function;

public class Function_class {
	
	public static void main(String[] args) {
		Function<String, Integer> function = s->s.length();
		System.out.println(function.apply("micheal"));
		System.out.println(function.apply("Jackson Dangarous"));
	}
}
