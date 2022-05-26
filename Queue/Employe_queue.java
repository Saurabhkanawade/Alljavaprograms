package Queue;

import java.util.*;

public class Employe_queue {

	public static void main(String[] args) {
	
		Employe_data data1=new Employe_data(101,"Saurabh Kanawade ","Cognizant","Banglore",89000);
		Employe_data data2=new Employe_data(102,"Shailesh Karpe   ","Capgemini","pune    ",67000);
		Employe_data data3=new Employe_data(103,"Shankar Kandekar "," TCS     ","Mumbai  ",75000);
		Employe_data data4=new Employe_data(104,"Sagar Bhomle     ","IBM      ","Infosys ",69000);
		
		
	PriorityQueue <Employe_data> emp=new PriorityQueue<Employe_data>();
		
	emp.add(data1);
	emp.add(data2);
	emp.add(data3);
	emp.add(data4);
	

  Iterator i=emp.iterator();
  
  while(i.hasNext()) {
	  
	  Employe_data e=(Employe_data)i.next();
	  
	  System.out.println(e.id+" "+e.name+" "+e.company+" "+e.location+" "+e.salary);
		  
	
	}
	
	}
}
