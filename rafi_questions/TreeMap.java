package com.rafi_questions;

public class TreeMap {
	/*  ( https://www.geeksforgeeks.org/treemap-in-java/ )
	 
	#. TreeMap in Java used to implement Map (I) and NavigableMap.
	#. The Map is sorted the natural ordering of its keys, or by a Comparator provided at map creation time, depending on which constructor is used. 
	#. TreeMap is not synchronized, to get synchronize - Collections.synchronizedMap(TreeMap object)
	#. TreeMap in Java does not allow null keys (like Map) and thus a NullPointerException is thrown. However, multiple null values can 
	   be associated with different keys.
	#. Internal structure: The methods in TreeMap while getting keyset and values, return Iterator that are fail-fast in nature, 
	      thus any concurrent modification will throw ConcurrentModificationException.
	-> TreeMap is based upon tree(red-black) data structure. Each node in the tree has,
		3 Variables (K key=Key, V value=Value, boolean color=Color)
		3 References (Entry left = Left, Entry right = Right, Entry parent = Parent)
	 */

}
