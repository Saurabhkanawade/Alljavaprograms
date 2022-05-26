package ArrayList;

import lombok.Data;

import java.util.*;


public class ArrayList_product {

	int pno;
	String pname;
	String pcompany;
	float price;
	
	ArrayList_product(int id,String name,String company,float p){
		
		pno=id;
		pname=name;
		pcompany=company;
		price=p;
	}
}
