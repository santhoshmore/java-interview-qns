package com.collections;

public class Diff_between_HashMapNHashtable {
	/*
	 **** HashMap ****
	 1. Every method present inside HashMap is not synchronized
	 2. At a multiple threads are allowed to operate on HashMap object n hence it is not Thread safe.
	 3. Relatively performance is high because threads are not required to wait to operate on HashMap object
	 4. Null is allowed for both key n value
	 5. Introduced in 1.2v n it is not legacy
	 
	 
	 **** Hashtable ****
	 1. Every method present inside Hashtable is synchronized
	 2. At a time only one thread is allowed to operate on Hashtable n hence it is thread safe
	 3. relatively performance is low because threads are required to wait to operate on Hashtable object
	 4. Null is not allowed for keys n values o.w we will get NPE
	 5. Introduced in 1.0v n it is legacy
	 
	 
	Qn:  How to get synchronized version of HashMap object?
	Ans. By default HashMap is non-synchronized but we can get synchronized version of HashMap by using "synchronizedMap of method"
	     HashMap m = new HashMap();
	     Map m1    = Collections.synchronizedMap(m);
	     
	      # m1 -> is synchronized, m -> non - synchronized
	 
	 */
}
