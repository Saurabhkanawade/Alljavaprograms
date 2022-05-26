package Inheritance;

public class Employe1 {
  
		double salary=40000;
		
		void salary() {
			
			System.out.println("The salary of an Employe is :"+salary);
		}
}

     class PerEmploye extends Employe1{
    	 
    	double hike=1.35;
    	 
    	 
    	 void totalsalary() {
    	 
    		 double total=salary*hike;
    				 
    		 System.out.println("The base salary of PerEmploye is :"+salary);	 
        	 
    		 System.out.println("The total salary of PerEmploye is :"+total);	 
    	 }
     }
     
     class TempEmploye extends Employe1{
    	 
    	 double hike=1.5;
    	 
    	 
    	 void totalsalary() {
    		 
    		 double total=salary*hike;
    	     		 
    		 System.out.println("the base salary of an TempEmploye is :"+salary);
    		 
    	    System.out.println("the total salary of an TempEmploye is :"+total);
    	 }
     }
     
     class Testall{
    	 
    	 	public static void main(String[] args) {
		// TODO Auto-generated method stub
                   
    	 		Employe1 e=new Employe1();
    	 		
    	 		TempEmploye t=new TempEmploye();
    	 		
    	 		PerEmploye p=new PerEmploye();
    	 		
    	  e.salary();
    	  
    	
    	  t.totalsalary();
    	  
    	  p.totalsalary();		
    	  
	}


}