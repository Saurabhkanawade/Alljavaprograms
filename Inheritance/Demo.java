package Inheritance;

public class Demo {
	
	void display(int a,int b) {		
  
		System.out.println(a+" "+b);
		
	}
	
	void display(float a,float b,double c) {
		
		System.out.println(a+" "+c+" "+b);
	}
}
	class Testcheck{
		
	
	public static void main(String[] args) {
		
  Demo s=new Demo();
  
  s.display(25,25);
  s.display(25,25,25);
	
  
  
	}

	}	
