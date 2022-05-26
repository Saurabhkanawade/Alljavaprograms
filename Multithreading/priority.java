package Multithreading;

public class priority extends Thread {
	public void run() {
	System.out.println("the running thread is:"+Thread.currentThread().getName());
	System.out.println("the priority of  Thread is:"+Thread.currentThread().getPriority());
	}

	public static void main(String[] args) {
		priority t1=new priority();
		priority t2=new priority();
		
		t1.setPriority(MAX_PRIORITY);
		t2.setPriority(MIN_PRIORITY);
		t1.start();
		t2.start();
	}
}
