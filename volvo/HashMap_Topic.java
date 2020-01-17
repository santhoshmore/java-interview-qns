package volvo;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMap_Topic {
	/*
	**** HashMap - properties ****
	  1. underlying DataStructure is Hashtable, 
	  2. insertion order is not preserved and it is based on hashCode of keys
	  3. Duplicate keys are not allowed
	  4. Duplicate values are allowed
	  5. Heterogeneous objects are allowed for both keys & values
	  6. For Keys null is allowed only once, for values null is allowed for any no of times
	  7. HashMap implements Serializable, Cloneable but not RandomAccessInterface
	  8. best choice if option for "search" operation
	  
	  creates empty hashMap with Default initial capacity is 16 & default fill ratio 0.75
	 */

	public static void main(String[] args) {
		HashMap<String, String> m = new HashMap<>();
		m.put("santhosh", "9123");
		m.put("rafi", "4340");
		m.put("praveen", "3423");
		m.put("ranji", "3432");
		System.out.println(m);
		
		m.put("santhosh", "1000");
		System.out.println(m);
		
		Set<String> keys=  m.keySet();
		System.out.println(keys);
		Collection<String> values = m.values();
		System.out.println(values);
		
		Set s1 = m.entrySet();
		System.out.println(s1);
		
		Iterator itr = s1.iterator();
		while(itr.hasNext()){
			Map.Entry<String, String> entry= (Entry<String, String>) itr.next();
			System.out.println(entry.getKey()+"------"+entry.getValue());
			if(entry.getKey().equalsIgnoreCase("rafi")){
				entry.setValue("3000");
			}
		}
		System.out.println(m);
	}
}
