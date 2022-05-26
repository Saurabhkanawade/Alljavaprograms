package Map;

import java.util.*;

public class Demo_linkedhashmap {

	public static void main(String[] args) {
		
		
		LinkedHashMap <Integer,String>l=new LinkedHashMap<Integer,String>();
		
		l.put(1,"saurabh");
		l.put(2, "abhi");
		
		for(Map.Entry print:l.entrySet()) {
			
			System.out.println(print);
		}
	}
}
