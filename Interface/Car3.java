package Interface;

public interface Car3 {
	
	void speed();
}

interface Plane{
	
	void speed();
}

class Display1 implements Car3,Plane{
	
	public void speed() {
		
		System.out.println("this is speed ");
	}
}

class Testcar{
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Display1 s=new Display1();
		
		s.speed();
		
	}

}
