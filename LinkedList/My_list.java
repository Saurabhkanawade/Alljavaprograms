package LinkedList;

import java.util.*;

public class My_list {
	
	public static void main(String[] args) {
		
		ArrayList<My_data> al=new ArrayList<My_data>();

		al.add(new My_data(101,"Saurabh","Thar","Bullet","Dwarka"));
		al.add(new My_data(101,"Shubham","Thar","Bullet","Dwarka"));
		al.add(new My_data(101,"Sainath","Thar","Bullet","Dwarka"));
		al.add(new My_data(101,"Shailes","Thar","Bullet","Dwarka"));
		al.add(new My_data(101,"Shankar","Thar","Bullet","Dwarka"));
		
		//System.out.println(al.remove(2));
		
		Iterator i=al.iterator();
		
		while(i.hasNext()) {
			
			My_data d=(My_data)i.next();
			
		System.out.println(d.id);	
		}
		
		
		
		/*
    for(My_data print:al) {
    	
    	System.out.println(print.id+" | "+print.name+" | "+print.car+" | "+print.bike+" | "+print.house);
    }

	*/
	}

}
