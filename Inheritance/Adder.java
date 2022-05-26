package Inheritance;

public class Adder {

	static int add(int a,int b) {
		return a+b;
	}
	
	static int add(int a,int b,int c) {
		return a+b+c;
	}
}
	class Testadd{
	
	public static void main(String[] args) {
	
System.out.println(" "+Adder.add(25, 25));
System.out.println(" "+Adder.add(25, 25 , 25));
		
		
	}
	}

