package Anonmynous;

class MyThread2{
	

	
	public static void main(String[] args) {
		
		Thread t=new Thread(new Runnable() {
			
          public void run() {
				
				System.out.println("The is thread method");
			}
		});
     	t.start();     	
		System.out.println("main thread");
	}
	}

