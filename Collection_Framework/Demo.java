package Collection_Framework;

import java.util.*;

 class Demo {

	 public static void main(String[] args) {
		
		 ArrayList<String>a=new ArrayList<String>();
		 
		a.add("saurabh");
		a.add("rushikesh");
		a.add("shankar");
		a.add("shailesh");
		a.add("subhash");
		a.add("manoj");
		a.add("rajesh");
		a.add("pankaj");

		Collections.sort(a,Collections.reverseOrder());

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

		 System.out.println("While loop ");
		int s=0;

		while(s<a.size()){

			System.out.println(a.get(s));
			s++;
		}
	}
}
