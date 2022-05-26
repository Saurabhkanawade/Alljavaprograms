package Interface;

public interface Returnable {
	
	void print();
	
	static int cube(int x) {
		return x*x*x;
	}
}

	class Displayint implements Returnable{
		
		public void print() {
			
			System.out.print("the return value is :");
		}
		
	}
	class Testvalue{
		
	
	public static void main(String[] args) {
		
		
		Displayint r=new Displayint();
		
		r.print();
		
		System.out.println(Returnable.cube(2));
	}

	}
