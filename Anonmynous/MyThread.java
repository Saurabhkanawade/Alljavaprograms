package Anonmynous;

class MyThread {
	

	
	public static void main(String[] args) {
		
		Thread t=new Thread() {
			
          public void run() {
				
				System.out.println("The is thread method");
			}
		};
     	t.start();     	
		System.out.println("main thread");
	}
	}

