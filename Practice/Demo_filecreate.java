package Practice;

import java.io.IOException;
import java.io.FileNotFoundException;
import java.io.File;

public class Demo_filecreate {
public static void main(String[] args) {
	
	try {
	File F=new File("Demo.txt");
	
	if(F.createNewFile()) {
		
		System.out.println(" File is created "+F.getName());
	}
	
	else {
		
		System.out.println(" Error File is already exist" );
	}
	}
	catch(IOException e) {
		
		e.printStackTrace();
	}
	}
	
}
