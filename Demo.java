import java.util.*;
public class Demo {

	public static void main(String[] args) {

		ArrayList al=new ArrayList();

		al.add("saurabh");
		al.add("shailesh");
		al.add("Saurabh");

		al.add(48);

		String s=(String)al.get(0);
		Integer s1=(Integer)al.get(3);

		System.out.println(s);
		System.out.println(s1);

//		System.out.println(al.get(0));
//		System.out.println(al.get(1));
//		System.out.println(al.get(2));
//		System.out.println(al.get(3));


	}
	
}
