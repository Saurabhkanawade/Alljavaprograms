package Map;

import java.util.*;

public class Demo_Hashmap {

	public static void main(String[] args) {
		
		
		Map<Integer, String> m=new TreeMap<Integer, String>();
		
		m.put(7, "gaurabh");
		//m.put(null, null);
       	m.put(2, "eaurabh");
       	m.put(9, "saurabh");
       	m.put(4, "saurabh");
		m.put(5, "saurabh");
		m.put(6, "saurabh");



		//Set s=m.entrySet();
		
		//Iterator i=s.iterator();
		/*
		while(i.hasNext()) {
			
Map.Entry a=(Map.Entry)i.next();

System.out.println(a.getKey()+" "+a.getValue());
	
		}
		*/
		for(Map.Entry print:m.entrySet()) {
			
			System.out.println(print.getKey()+" "+print.getValue());
		
		
		}
	}
}
