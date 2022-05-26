package Serialization;

import java.util.*;
import java.io.*;


public class Demo_emp {
	
	public static void main(String[] args)throws Exception {
		
		ObjectInputStream o=new ObjectInputStream(new FileInputStream("Saurabh.txt"));
 
		Demo_Employee e=(Demo_Employee)o.readObject();
		
		System.out.println(e.id+" "+e.name+" "+ e.address+" "+e.salary);
		
		
		
	}

}
