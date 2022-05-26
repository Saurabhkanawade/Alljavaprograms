package Assignment_2;

public class Vehicle3 {
	
	int no;
	int speed=0;
	int brake;
	
	Vehicle3(int speed,int brake){
	
		//this.no=no;
		this.speed=speed;
		this.brake=brake;
		
	}
	
	void accelerate() {
		speed=speed+5;
		System.out.println("The speed is :"+speed);
	}
	
	void brake() {
		brake=speed-5;
		System.out.println("The brake is :"+brake);
	}
	
	void display() {
		
		System.out.println("The Normal speed of the vehicle :"+speed);
		System.out.println("The brake is applied then speed is : "+brake);
	}
	
	
	
	public static void main(String[] args) {
	
		
		Vehicle3 V=new Vehicle3(15,5);
		
		V.display();
		V.accelerate();
		V.brake();
		V.accelerate();
		V.brake();
	}

}
