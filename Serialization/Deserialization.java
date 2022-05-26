package Serialization;

import java.io.*;

public class Deserialization {

	public static void main(String[] args) throws Exception{
	
		ObjectInputStream out=new ObjectInputStream(new FileInputStream("saurabh.txt"));
		Demo_Employee E=(Demo_Employee)out.readObject();
		

		System.out.println(E.id+" "+E.name+" "+E.address+" "+E.salary);
	
	}
}
