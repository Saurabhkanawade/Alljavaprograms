package File_handlling;

import java.io.*;

public class Book_serializable {

	public static void main(String[] args) throws Exception{
		
		Book b=new Book(101," Rich dad poor dad",399);
		
		FileOutputStream f=new FileOutputStream("saurabh.txt");
		ObjectOutputStream o=new ObjectOutputStream(f);
		
		o.writeObject(b);
		o.flush();
		o.close();
		
		System.out.println(" Wrote Suceess ");
		
	}
}
