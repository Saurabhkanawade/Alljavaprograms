package Assignment_2;

public class Vehicle8 {


	int litter;
	int ml;
	int speed;

	Vehicle8(int litter){
		
		this.litter=litter;
    	System.out.println("the speed of the vehicle is :"+speed);

		
	}
	
	{
		speed=100;
	}
	
	void fuelcapacity() {
		
		int mls=litter*1000; 
		
		System.out.println("The fuel capacity in :"+litter +" litter");
		System.out.println("The fuel capacity in :"+mls+ " ml");
		
	}
	
	
	public static void main(String[] args) {
		
		Vehicle8 s=new Vehicle8(8);
		
		s.fuelcapacity();
		
	}
}
