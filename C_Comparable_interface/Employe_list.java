package C_Comparable_interface;

import java.util.*;

public class Employe_list {

	public static void main(String[] args) {
		
		Employe e1=new Employe(101,"Saurabh Kanawade","GOOGLE",89000);
		Employe e2=new Employe(102,"Shankar Kandekar","AMAZON",63000);
		Employe e3=new Employe(103,"Shailesh Karpe  ","Wipro ",43000);
		Employe e4=new Employe(104,"Harshal Thombare","TCS   ",76000);
		
		ArrayList<Employe>al=new ArrayList<Employe>();
		
		al.add(e1);
		al.add(e2);
		al.add(e3);
		al.add(e4);
		
	  Collections.sort(al);
		for(Employe print:al) {
			
			System.out.println(print.id+" | "+print.name+" | "+print.company+" "+print.salary);
		}
		
	}
	
}
