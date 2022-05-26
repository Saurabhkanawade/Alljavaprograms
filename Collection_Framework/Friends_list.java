package Collection_Framework;

import java.util.*;

 class Friends_list {

	 String name;

	 public static void main(String[] args) {

		 Friends_list friends_list=new Friends_list();
		 friends_list.name="saurabh kanawade";

		 ArrayList<String>a=new ArrayList<String>();


		a.add(friends_list.name);
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
		a.add("pankaj");
		a.add(2,"shubham");


		 System.out.println(a);



//
//		System.out.println(a.isEmpty());
//		System.out.println(a.size());
//		System.out.println(a.lastIndexOf(a));
//		System.out.println(a.spliterator());
//		//System.out.println(a.removeAll(a));
//		System.out.println(a.retainAll(a));
//		a.set(1, "jayashree");//System.out.println(a.sort());
//
//	 	Collections.sort(a);
		
//		for(int i=0; i<a.size();i++) {
//
//			System.out.println(a.get(i));
//
//		}


	 }
 }
		
	