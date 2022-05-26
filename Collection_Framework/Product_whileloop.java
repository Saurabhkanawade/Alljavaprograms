package Collection_Framework;

import java.util.*;

public class Product_whileloop {
	public static void main(String[] args) {
		
		SortedSet <String>al=new TreeSet<String>();
	
	al.add("saurabh");
	al.add("rushikesh");
	al.add("shankar");
	al.add("shaileh");
	al.add("sagar");
	//al.add(null);
	//al.add(null);
	al.add("shankar");
	al.add("jayashree");
	
	al.add("zayashree");

  Iterator it=al.iterator();
  
  while(it.hasNext()) {
	  
	  System.out.println(it.next());
  }
	
}
}
