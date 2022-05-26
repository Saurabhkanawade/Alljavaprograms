package Interview_questions;

import java.util.*;
import java.io.*;

public class Read_file_content {

	public static void main(String[] args) throws Exception{
		
		FileInputStream s=new FileInputStream("Saurabh.txt");
		
		//Scanner sc=new Scanner(s);
		int i=0;
       while((i=s.read())!=-1) {
    	   
    	   System.out.print((char)i);
       }
		
	}
}
