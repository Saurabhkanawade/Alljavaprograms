package Interface;

public interface Returnable5 {
	
     void print();
	
	private  int cube(int x) {
		return x*x*x;
	}
}

	class Displayint5 implements Returnable{
		
		 public void print() {
			
			System.out.print("the return value is :");
		}
		
	}
	class Testvalue5{
		
	
	public static void main(String[] args) {
		
		
		Displayint r=new Displayint();
		
		r.print();
		
		System.out.println(Returnable.cube(2));
	}

	}
