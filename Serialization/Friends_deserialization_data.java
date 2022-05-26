package Serialization;

import java.io.*;
import java.io.Serializable;
public class Friends_deserialization_data {

	public static void main(String[] args) throws Exception{
		
		ObjectInputStream o=new ObjectInputStream(new FileInputStream("Saurabh.txt"));
		Friends_serialization f=(Friends_serialization)o.readObject();
		
		System.out.println(f.phone+" | "+f.name+" | "+f.village+" | "+f.firstmeet);
		
	}
}
