package File_handlling;

import java.io.*;
import java.io.IOException;
import java.io.FileNotFoundException;

public class Demo_create_file {
	public static void main(String[] args) {
	
 try {
	 
	 File f=new File("C:\\Users\\saura\\eclipse-workspace\\Saurabh\\java.txt");
	 
	 if(f.createNewFile()) {
		 
		 System.out.println(" File is created ");
		 System.out.println(" File name is : "+f.getName());
	 }
	 
	 else {
		 
		 System.out.println(" File is already exist ");
	 }
 } 
	 catch(IOException e) {
		 
		 e.printStackTrace();
	 }
 }
}
