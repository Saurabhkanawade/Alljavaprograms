package Synchronisation;

import java.util.*;

 class Customer {

	int Amount=5000;
	
	synchronized void withdraw(int Amount) {
		
		System.out.println(" Going to withdraw the amount ");
		
		if(this.Amount>Amount) {
			
			System.out.println(" Less Amount , Going to deposit the amount ");
	      
			try {
				
				wait();
			}
			
			catch(Exception e) {
				
	      	e.printStackTrace();
		}
		}
		
			this.Amount -=Amount;
		System.out.println(" Amount withdraw sucessfully ");	
			
		}
 
	synchronized void deposit(int Amount) {
		
	System.out.println(" Going to deposit the Amount ");
	
	this.Amount +=Amount;
	
	System.out.println(" Amount deposited Sucessfully ");
	
	}
 }
	 class Testthesynch{
		
		public static void main(String[] args) {
			
			
		final Customer C=new Customer();
		
		new Thread() {
			
			public void run() {
				
				C.withdraw(6000);
			}
		}.start();
		
		new Thread() {
			
			public void run() {
				
				C.deposit(1000);
			}
		}.start();
			
			
		}
}