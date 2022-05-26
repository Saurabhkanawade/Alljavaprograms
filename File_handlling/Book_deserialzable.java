package File_handlling;
import java.io.*;

public class Book_deserialzable {

	public static void main(String[] args) throws Exception{
		
	 ObjectInputStream o=new ObjectInputStream(new FileInputStream("saurabh.txt"));	
		
		Book b=(Book)o.readObject();
		
		System.out.println(b.id+" "+b.Book_name+" "+b.Book_price);
	}
}
