package LinkedList;

import java.util.*;

public class LinkedList_list {

	public static void main(String[] args) {
		
		LinkedList_data ll=new LinkedList_data(101, "Saurabh Kanawade"," Smbst College  "," IBM     " ,"Benglore");
		LinkedList_data ll1=new LinkedList_data(102,"Shailesh Karpe  "," Sharmik College","AMAZON   ", "Delhi   ");
		LinkedList_data ll2=new LinkedList_data(103,"Shankar Kandekat"," Petit College  ","ACCENTURE", "Pune    ");
		LinkedList_data ll3=new LinkedList_data(104,"Sagar Bhomale   "," Agasti College ","WIPRO    ", "Nasik   ");
		LinkedList_data ll4=new LinkedList_data(105,"Rushi Kandekar  "," AOVCE College  ","INFOSYS  ", "Sangmner");
		
		LinkedList<LinkedList_data>ad=new LinkedList<LinkedList_data>();
		
		ad.add(ll);
		ad.add(ll1);
		ad.add(ll2);
		ad.add(ll3);
		ad.add(ll4);


		//System.out.println("REMOVE the element :"+ad.removeLast());

		/*
		Iterator i=ad.iterator();

		while(i.hasNext()) {
			
			LinkedList_data ld=(LinkedList_data)i.next();
			
			System.out.println(ld.roll+" | "+ld.name+" | "+ld.college+" | "+ld.company+" | "+ld.location);
		*/
			
	 System.out.println();
	 System.out.println(" Iterating using the for each loop");
     System.out.println();

	 for (LinkedList_data print:ad) {
		 
			System.out.println(print.roll+" | "+print.name+" | "+print.college+" | "+print.company+" | "+print.location);

		}
		
	}
}
