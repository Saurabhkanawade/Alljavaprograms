package Interface;

public interface Demo_interface {

	void run();
}

class Demo_interface2 implements Demo_interface{
	
	public void run() {
		
		System.out.println("This is implemented method");
	}
	
	
	public static void main(String[] args) {
		
		
		Demo_interface2 f=new Demo_interface2();
		
		f.run();
	}
}