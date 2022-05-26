package Multithreading;

public class Demo7_getset extends Thread{

	public void run() {
		
		System.out.println("This is Run method");
	}


public static void main(String[] args) {
	
	Demo7_getset d1=new Demo7_getset();
	Demo7_getset d2=new Demo7_getset();
	Demo7_getset d3=new Demo7_getset();
	
	System.out.println("The name of the Thread : "+d1.getName());
	System.out.println("The name of the Thread : "+d2.getName());
	System.out.println("The name of the Thread : "+d3.getName());
	
	System.out.println("The name of the Thread : "+d1.getId());
	System.out.println("The name of the Thread : "+d2.getId());
	System.out.println("The name of the Thread : "+d3.getId());
	
	d1.setName("Multithreading");
	d2.setName("Multitasking");
	d3.setName("Multiprocessing");
	
	System.out.println("After changing the Thread name : "+d1.getName());
	System.out.println("After changing the Thread name : "+d2.getName());
	System.out.println("After changing the Thread name : "+d3.getName());
	
	
}
}
