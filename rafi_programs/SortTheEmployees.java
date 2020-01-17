package com.rafi_programs;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class SortTheEmployees {
		public static void main(String[] args) {
			
			HashMap<Employee,Integer> hm=new HashMap<Employee,Integer>();
			hm.put(new Employee(104,"Rafi"),104);
			hm.put(new Employee(108,"afi"),108);
			hm.put(new Employee(106,"fi"),106);
			
			hm.entrySet()
			.stream()
			.sorted(Map.Entry.comparingByKey())
			.forEach(System.out::println);
	}
}
