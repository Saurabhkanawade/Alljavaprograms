package Collection_Framework;

import java.util.*;

public class Product_foreactloop {

	public static void main(String[] args) {
		
		ArrayList <String>al=new ArrayList<String>();
		
		al.add("saurabh");
		al.add("rushikesh");
		al.add("shankar");
		al.add("shailesh");
		al.add("sagar");

		System.out.println(al.isEmpty());
		System.out.println(al.clone());
		System.out.println(al.set(3,"three"));
		System.out.println(al.size());

		for(String print:al) {
			
			System.out.println(print);
		}
	}
}
