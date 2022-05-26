package Serialization;

import java.io.*;

public class Serializable2 {
	
	public static void main(String[] args) {
		
		try {
		Demo_Employee e=new Demo_Employee(101,"saurabh kanawade","Dombivli",160000);
		
		FileOutputStream fout=new FileOutputStream("saurabh.txt");
        
		ObjectOutputStream out=new ObjectOutputStream(fout);
		
		out.writeObject(e);
		out.flush();
		out.close();
		
		System.out.println(" Wrote Data into file Succesfully ");
		}
		
		catch(IOException e) {
			
			e.printStackTrace();
		}
		
	}

}

