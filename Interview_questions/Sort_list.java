package Interview_questions;

import java.util.*;

public class Sort_list {

	public static void main(String[] args) {
		
		ArrayList al=new ArrayList();
		
		al.add(new Sort(1,"ravi    ","Trainee"));
		al.add(new Sort(2,"ravi    ","MD"));
		al.add(new Sort(2,"amit    ","MD"));
		al.add(new Sort(3,"ravi    ","Ceo"));
		al.add(new Sort(4,"ravindra","Ceo"));
		al.add(new Sort(5,"ravish  ","Trainee"));
		
		
		
		Collections.sort(al,new Sort_name());

		Iterator i=al.iterator();
		
		while(i.hasNext()){
			
			Sort s=(Sort)i.next();
			System.out.println(s.id+" | "+s.name+" | "+s.job);
		}
	}
}
