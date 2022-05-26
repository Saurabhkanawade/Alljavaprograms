package Serialization;

import java.io.*;
import java.io.Serializable;

class Friends_serialization implements  Serializable{

	int phone;
	String name;
	String village;
	String firstmeet;
	
	Friends_serialization(int phone,String name,String village,String firstmeet){
		
		this.phone=phone;
		this.name=name;
		this.village=village;
		this.firstmeet=firstmeet;
	}
}
