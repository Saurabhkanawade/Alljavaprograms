package Inheritance;

public class Method_overload {

	
	static int add(int a, int b) {
		
		return a+b;
		
	}
	
	static int add(int a, int b , int c) {
		
		return a+b+c;
	}
	
	
	public static void main(String[] args) {
		
		System.out.println(Method_overload.add(50, 50));
		System.out.println(Method_overload.add(50, 50 , 50));
		
	}
}
