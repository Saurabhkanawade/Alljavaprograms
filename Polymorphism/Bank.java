package Polymorphism;

public class Bank {
	
	float getRateOfIntrest() {
		return 0;
	}
}

class Sbi extends Bank{
	
	float getRateOfIntrest(){
		return 5.6f;
	}
}

class Axis extends Bank{
	
	float getRateOfIntrest(){
		return 6.5f;
	}
}

class Icici extends Bank{
	
	float getRateOfIntrest(){
		return 7.2f;
	}
}


class Testbank{
	
	public static void main(String args[]) {

		Bank b;
		
		b=new Sbi();
		
		System.out.println("The of Intrest of bank :"+b.getRateOfIntrest()+" %");
		
        b=new Axis();
		
		System.out.println("The of Intrest of bank :"+b.getRateOfIntrest()+" %");
		
        b=new Icici();
		
		System.out.println("The of Intrest of bank :"+b.getRateOfIntrest()+" %");
		
	
	}
}