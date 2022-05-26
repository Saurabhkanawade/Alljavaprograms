package Multithreading;

public class Demo_extendsthread extends Thread{

	public void run() {
		
		System.out.println("This is run Thread");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Demo_extendsthread d1=new Demo_extendsthread();
		Demo_extendsthread d2=new Demo_extendsthread();
		
		d1.start();
		d2.start();

	}

}
