
package Synchronisation;

import java.util.*;

public class Parent implements Runnable{
	
	Thread parent;
	Bank2 b;
	
	Parent(Bank2 b){
		
		this.b=b;
		
		parent =new Thread(this,"deposit");
		
	    parent.start();
	}
	
	public void run() {
		
		b.deposit();
	}
 } 

  class Child implements Runnable{

	Thread child;
	Bank2 b;
	
	Child(Bank2 b){
		
		this.b=b;
	    child=new Thread(this,"withdraw");
	    
	    child.start();
	}
	
	public void run() {
	
		b.withdraw();
	}
}

class Bank2 {
	
	public int depositamt;
	public int withdrawamt;
	public int balance=5000;
	
	
	public int deposit() {
		
		try {

			Scanner s=new Scanner(System.in);
		
		System.out.println("The balance before the deposit amt : "+balance);
		Thread.sleep(1500);
		
		System.out.println(" Enter the deposit amt ");
		depositamt=s.nextInt();
		
        Thread.sleep(500);
        
        balance=balance+depositamt;
        Thread.sleep(1000);
        
        System.out.println(" The balance after the deposit : "+balance);
		
	   System.out.println(" The Amount deposited Sucessufully ");
	
         
	  }
		catch(Exception e) {
			
			e.printStackTrace();
		}
	
	return balance;
}

 public int withdraw() {
 
	   try {
		   
	 Scanner s=new Scanner(System.in);
	 
	 System.out.println(" The balance before the withdraw amt : "+balance);
	 Thread.sleep(1500);
	 
	 System.out.println(" Enter the amt to withdraw ");
	 withdrawamt=s.nextInt();
	 Thread.sleep(500);
	 
	 balance=balance-withdrawamt;
	 System.out.println(" The balance after the amount withdraw : "+balance );
	 Thread.sleep(1000);
	
	   System.out.println(" The Amount Withdraw Sucessfully ");

       } 
	   catch(Exception e) {
		
		   e.printStackTrace();
	   }
	
	return balance;
}

 
  public static void main(String[] args) {
	
	 Bank2 B=new Bank2();
	 
	 Parent p=new Parent(B);
	 Child c=new Child(B);
}
}
