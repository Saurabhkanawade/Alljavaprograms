package Inheritance;

public class Adder22 {
	
	double add(int a,int b) {
		
		return a+b;
	}
	
	double add(double a,double b,double c) {
		return a+b+c;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Adder22 a=new Adder22();
		
		System.out.println(" "+a.add(25, 25));
		System.out.println(" "+a.add(100, 25, 25));
		
	}

}
