package Collection_Framework;

import java.util.*;

public class Demo_lists {

	public static void main(String[] args){
		
		ArrayList <String> l=new ArrayList<String>();
		
		l.add("saurabh");
		l.add("Zebra");
		l.add("xeviar");
		l.add("Zebra");
		l.add(null);
		l.add(null);
		
		
	
	Iterator i=l.iterator();
	
	while(i.hasNext()) {
		
		System.out.println(i.next());
		
	}
	}
}
