package Collection_Framework;

import java.util.*;

 class Demo {

	 public static void main(String[] args) {
		
		 ArrayList<String>a=new ArrayList<String>();
		 
		a.add("saurabh");
		a.add("rushikesh");
		a.add("shankar");
		a.add("shailesh");
		a.add("sagar");
		a.add("rohit");
		a.add("harshal");
		a.add("aniket");		
		a.add("sanket");
		a.add("pravin");
		a.add("ashish");
		a.add("subhash");
		a.add("manoj");
		a.add("rajesh");
		a.add("Pankaj");
		
		System.out.println("with list method :"+a);
		
		System.out.println();
		//Using the Iterater method
		
		Iterator i=a.listIterator();
		
		while(i.hasNext()) {
			
			System.out.println(" "+i.next());
		}
		
		
		//using the for loop
		System.out.println();
		
		for(int j=0;j<a.size();j++) {
			
			System.out.println(" "+a.get(j));
		}
		
		//for each loop 
		System.out.println();
		
		for(String print:a) {
			
			System.out.println(" "+print);
		}
	}
}
