
public class Bank_Poly {
	
	float getrateofintrest() {
		
		return 0;
	}
}

class Axiss extends Bank_Poly{
	
	float getrateofintrest() {
		
		return 4;
	}
}

class ICICI extends Bank_Poly{
	
	float getrateofintrest() {
		
		return 5;
	}
}

class BOI extends Bank_Poly{
	
	float getrateofintrest() {
		
		return 8;
	}
}

class tttest{

	public static void main(String[] args) {
		
		Bank_Poly b;
		
		
		b=new Axiss();
		
		System.out.println("The getrateofintrest : "+b.getrateofintrest());
		
		b=new BOI();
		
		System.out.println("The getrateofintrest : "+b.getrateofintrest());
		
		b=new ICICI ();
		
		System.out.println("The getrateofintrest : "+b.getrateofintrest());

		b=new ICICI ();

		System.out.println("The getrateofintrest : "+b.getrateofintrest());
		
	}
	

}
