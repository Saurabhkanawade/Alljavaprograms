package Interface;

interface Runable {

	void run();
	
}

class Splender implements Runable{
	
	public void run(){
		
		System.out.println("The bike is splender");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Splender s=new Splender();
		
		s.run();
		
	}

}
