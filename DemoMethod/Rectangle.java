package DemoMethod;

public class Rectangle {

	int length ;
	int width;
	
	void insert(int l,int w) {
		
	  length=l;
	  width=w;
	}	
	
	void calculateArea() {
		
		System.out.println("The area of rectangle :"+length*width);
	}
}
	class Testrectangle{
		
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Rectangle r=new Rectangle();
	
	r.insert(11, 6);
		
	r.calculateArea();
	}

	}