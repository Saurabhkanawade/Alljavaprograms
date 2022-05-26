package Inheritance;

public class Adder11 {
	
	static int add(int a,int b) {
		return a+b;
	}
	
	static double add(double a,double b,double c) {
		return a+b+c;
	}
}
	class Testad{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(" "+Adder11.add(25, 25));
		System.out.println(" "+Adder11.add(25.5, 25, 25.3));
	}
	}
	
	