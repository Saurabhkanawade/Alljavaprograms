package Collection_Framework;

import java.util.*;

 class Product_forremaining {

	 public static void main(String[] args) {
		
		 ArrayList<String>a=new ArrayList<String>();
		 
		a.add("saurabh");
		a.add("rushikesh");
		a.add("shankar");
		a.add("shailesh");
		a.add("sagar");
		a.add("rohit");
		a.add("harshal");
	
		Iterator i=a.iterator();
		
		while(i.hasNext()) {
			
			System.out.println(i.next());
		}
		
	 
	 }
	 }
 