 package Queue;
import java.util.*;

public class Queue_list {

	public static void main(String[] args) throws Exception{
		
		Queue<String> p=new PriorityQueue<String>();
		
		p.add("");
		p.add("zhailesh");
		p.add("sagar");
		p.add("shankar");
		
		Iterator i=p.iterator();
		
		while(i.hasNext()) {
			
			System.out.println(i.next());
			
		}
		
		for(String print:p) {
			
			System.out.println(print);
		}
	}
}
