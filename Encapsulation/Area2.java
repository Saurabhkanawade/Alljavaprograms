package Encapsulation;

public class Area2 {
	
	private int length;
	private int width;
	
	public int getArea() {
		return length*width;
	}



	public void setArea(int length,int width) {
		
		this.length=length;
		this.width=width;
	}



	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Area2 a=new Area2();
		
		a.setArea(20, 25);
		
		System.out.println(a.getArea());
	}

}
