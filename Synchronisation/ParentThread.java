package Synchronisation;
import java.util.*;
public class ParentThread implements Runnable{

	Thread parent;
	Bank b;
	
	ParentThread(Bank b){
		
		this.b=b;
		
		parent=new Thread(this,"deposit");
		parent.start();
		
	}
	
	public  void run() {
		
		b.deposit();
	}
	}

class ChildThread implements Runnable{
	
	Thread child;
	Bank b;
	
	ChildThread(Bank b){
		
		this.b=b;
		
		child=new Thread(this,"withdraw");
		child.start();
	}
	
	public void run() {
		
		b.withdraw();
	}
}

class Bank{
	
	private double balance=5000;
	private int withdrawamt;
	private int depositamt;
	
	
	synchronized double deposit() {
		
		try {
			
			Scanner s=new Scanner(System.in);
			System.out.println("Balance before deposit : "+balance);
			Thread.sleep(1000);
			
			System.out.println("Enter the deposit amt");
			depositamt=s.nextInt();
			
			Thread.sleep(500);
			
			balance=balance+depositamt;
			Thread.sleep(1500);

			System.out.println("Balance after the deposit :"+balance);
			System.out.println();			
		}
		
		catch(Exception e) {
			
			e.printStackTrace();
		}
		
		return balance;
		
	}

	
	
 synchronized double withdraw() {
		
		try {
			
			Scanner s=new Scanner(System.in);
			System.out.println("Balance before withdraw : "+balance);
			Thread.sleep(1000);
			
			System.out.println("Enter the withdrawamt");
			withdrawamt=s.nextInt();
			
			Thread.sleep(500);
			
			balance=balance-withdrawamt;
			Thread.sleep(1500);
			
			System.out.println("Balance after the withdraw :"+balance);
			
		}
		
		catch(Exception e) {
			
			e.printStackTrace();
		}
		
		return balance;
	}
}

class Tst{
	
	public static void main(String[] args) {
		
		Bank b=new Bank();
	
		
		ParentThread P=new ParentThread(b);
		ChildThread C=new ChildThread(b);
		
		
	}
	
	
}
