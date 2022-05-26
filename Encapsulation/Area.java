package Encapsulation;


public class Area {
	private int length;
	private int width;
	
	Area(int length ,int width){
	
	this.length=length;
	this.width=width;


}
  
  public void getarea() {
	  System.out.println(length*width);
  }
}

class TestAreas{
	public static void main(String args[]) {


		Area a=new Area(20,25);
		
		a.getarea();
		

	}
}