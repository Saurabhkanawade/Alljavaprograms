package Serialization;

import java.io.*;

public class Friends_serialization_data {

	public static void main(String[] args) throws Exception{
	    
		Friends_serialization f1=new Friends_serialization(982248,"Saurabh kandekar","Konknewadi","At 10th Exam");
		Friends_serialization f2=new Friends_serialization(463464,"Shailesh Karpe","Pimpalgaon Konzira","At Bcs classroom");
		Friends_serialization f3=new Friends_serialization(943646,"Rushikesh Kandekar","Konknewadi","At Mumbai");
		Friends_serialization f4=new Friends_serialization(845658,"Sagar Bhomale","Konknewadi","At Shivneri");
		
	FileOutputStream f=new FileOutputStream("Saurabh.txt");	
	ObjectOutputStream out1=new ObjectOutputStream(f);
	
	out1.writeObject(f1);
	out1.writeObject(f2);
	out1.writeObject(f3);
	out1.writeObject(f4);
	
	out1.flush();
    out1.close();
	
    System.out.println("Sucessesfully wrote into the file");
    
	}

}
