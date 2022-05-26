package Collection_Framework;

import java.util.*;

public class Bike_list {

	public static void main(String[] args) {
		
		
		Bike_data b1=new Bike_data(1034,"KTM          ","DUKE 390          ",234000);
		Bike_data b2=new Bike_data(1039,"YAMHA        ","FZ-S BS6          ",130050);
		Bike_data b3=new Bike_data(1035,"ROYAL ENFIELD","CLASSIC 350 BULLET",230007);
		Bike_data b4=new Bike_data(1036,"HERO         ","SPLENDER          ",750003);
		
			ArrayList <Bike_data>al=new ArrayList<Bike_data>();
			
			al.add(b1);
			al.add(b2);
			al.add(b3);
			al.add(b4);
			
			/*
			  for(Bike_data print:al) {
			 
				
				System.out.println(print);
			  
			}
			
			*/
			
			
				
			
		
			Iterator j=al.iterator();
			
			while(j.hasNext()) {
				
				Bike_data bi=(Bike_data)j.next();
				
				System.out.println(bi.no+" | "+bi.company_name+" | "+bi.model+" | "+bi.price+" DREAM ");
			}

			

	}
}
