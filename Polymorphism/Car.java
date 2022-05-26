package Polymorphism;

public class Car {

	 int speed=90;
	
}

 class Swift extends Car{
	
    int speed=60;
	
    {	
	  //System.out.println("the speed of an Car is 1 : "+super.speed);
		
}
	}

class Testcar{
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	   Car s=new Swift();

	   System.out.println("the speed of an Car is 2 : "+s.speed);
		
	}
}
