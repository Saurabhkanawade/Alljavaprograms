package Serialization;

import java.io.*;
import java.io.Serializable;

 class Demo_Employee implements Serializable{
	
	int id;
	String name;
	String address;
	float salary;
	
	
	Demo_Employee(int id,String name, String address,float salary){
		
		this.id=id;
		this.name=name;
		this.address=address;
		this.salary=salary;
	}

}
