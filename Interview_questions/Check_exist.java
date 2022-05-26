package Interview_questions;

import java.io.*;

public class Check_exist {

	public static void main(String[] args) throws Exception{
		
		
		try {
			
		File f=new File("Saurabh.txt") ;
			
			
			if(f.exists()) {
        	
        System.out.println("The file is already exist");
        
        
        
				
        }
			
			else {
				
				System.out.println("The file is not found");
				
			}
		}			
			catch(Exception e) {
			
			e.printStackTrace();
		}
}
}