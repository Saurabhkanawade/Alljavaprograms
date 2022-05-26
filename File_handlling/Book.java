package File_handlling;

import java.io.*;

public class Book implements Serializable{
	
	int id;
	String Book_name;
	float Book_price;
	
	Book(int i,String b,float p){
		
		id=i;
		Book_name=b;
	    Book_price=p;
	   
	}

}
