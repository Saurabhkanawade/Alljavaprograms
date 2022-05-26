package Interface;

public interface Drawable {

	void draw();
	
}

class Circle implements Drawable{
	
	public void draw() {
		
		System.out.println("printing the circle");
	}
}
class Squre implements Drawable{
	
	public void draw() {
		
		System.out.println("printing the squre");
	}
}
	class TestDraw{
	
public static void main(String[] args) {

/*	
	Drawable d=new Circle();
	
	d.draw();
 
	Drawable s=new Squre();
	
	s.draw();
	
*/
	
	Drawable d,s;
	
	d=new Squre();
	s=new Circle();
	
	d.draw();
	s.draw();
	
	
}
}