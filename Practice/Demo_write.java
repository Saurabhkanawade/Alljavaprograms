
package Practice;

import java.io.FileWriter;
import java.io.IOException;

public class Demo_write {

public static void main(String[] args) {
	
	System.out.println(" Writing into the file ....");
	
	try {
		
	
	FileWriter F=new FileWriter("Demo.txt");
		
		F.write(" Hello my name is saurabh kanawade at post vadgaon landga tel sangamner , dist : Ahamadnagar , state : maharashtra ");
		
		System.out.println(" Wrote in the file successfully ...");
		F.close();
	}
	
	catch(IOException e) {
		
		e.printStackTrace();
		
	}
}	
}
