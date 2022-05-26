package Abc_interview;

public class Demo {

	int add( int a,int b) {
		
		return a+b;
	}
	
	 int add(int a,int b,int c) {
		
		return a+b+c;
	}
	
	public static void main(String[] args) {
	
		Demo d=new Demo();
		
        System.out.println(d.add(10, 10));		
		System.out.println(d.add(10, 20, 20));
	
	}
}
