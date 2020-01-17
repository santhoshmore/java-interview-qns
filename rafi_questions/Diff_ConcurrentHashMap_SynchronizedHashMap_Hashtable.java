package com.rafi_questions;

public class Diff_ConcurrentHashMap_SynchronizedHashMap_Hashtable {
	/*
	 What is fail-fast in java?
	 
A fail-fast system is nothing but immediately report any failure that
is likely to lead to failure. When a problem occurs, a fail-fast system
fails immediately. In Java, we can find this behavior with iterators.
Incase, you have called iterator on a collection object, and another
thread tries to modify the collection object, then concurrent modification
exception will be thrown. This is called fail-fast.

    **** Difference between HashMap & ConcurrentHashMap  ****
    
    # HashMap is non-Synchronized in nature i.e. HashMap is not Thread-safe whereas ConcurrentHashMap is Thread-safe in nature.
    # HashMap performance is relatively high because it is non-synchronized in nature and any number of threads can perform 
      simultaneously. But ConcurrentHashMap performance is low sometimes because sometimes Threads are required to wait on 
      ConcurrentHashMap.
	# While one thread is Iterating the HashMap object, if other thread try to add/modify the contents of Object then we will get 
	  Run-time exception saying ConcurrentModificationException.Whereas In ConcurrentHashMap we wont get any exception while performing
	   any modification at the time of Iteration.
	# In HashMap, null values are allowed for key and values, whereas in ConcurrentHashMap null value is not allowed for key and value,
	  otherwise we will get Run-time exception saying NullPointerException.
	  
	**** Difference between ConcurrentHashMap & Hashtable ****
	
	# ConcurrentHashMap uses multiple buckets to store data. This avoids read locks and greatly improves performance over a HashTable. 
	  Both are thread safe, but there are obvious performance wins with ConcurrentHashMap.
	# When you read from a ConcurrentHashMap using get(), there are no locks, contrary to the HashTable for which all operations are 
	  simply synchronized. HashTable was released in old versions of Java whereas ConcurrentHashMap is a java 5+ thing.
	# HashMap is the best thing to use in a single threaded application  
	 */

}
