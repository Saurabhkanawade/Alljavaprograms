package Multithreading;

class Demo_Priority_Thread extends Thread{
	
	public void run() {
		
	System.out.println("This is Running Thread : "+Thread.currentThread().getName());
	
	System.out.println("This is Priority of Thread :"+Thread.currentThread().getPriority());
	
	}
	
	public static void main(String[] args) {
	
		Demo_Priority_Thread D1=new Demo_Priority_Thread();
		Demo_Priority_Thread D2=new Demo_Priority_Thread();
	
		D1.setPriority(Thread.MAX_PRIORITY);
		
		D2.setPriority(Thread.MIN_PRIORITY);
		
		
		D1.start();
		D2.start();
		
	}
}
