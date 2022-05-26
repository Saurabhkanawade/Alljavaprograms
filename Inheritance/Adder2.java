package Inheritance;

public class Adder2 {
   
	public int sum(int a,int b) {
		
		return a+b;
	}

   public int sum(int a,int b,int c) {
    	 
	   return a+b+c;
     }
   
}

class Testadder{
	
	public static void main(String args[]) {
		
		Adder2 a=new Adder2();
		System.out.println(" "+a.sum(25, 25));
		System.out.println(" "+a.sum(25, 25 , 25));
				

	
	}
}
     