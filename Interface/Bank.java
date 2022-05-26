package Interface;

 interface Bank {

	 float getRateOfIntrest();

 }

class Axis implements Bank{
	
	

	public float getRateOfIntrest() {
		
		return 6.5f;
	}
}

 class Sbi implements Bank{
    
	 
	public float getRateOfIntrest() {
		
		return 5.2f;
	}
 }
 
 class Icici implements Bank{
	 
	 public float getRateOfIntrest() {
			
			return 8.2f;
		}
	 } 

 class TestBank{
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Bank a=new Axis();
		Bank b=new Sbi();
		Bank c=new Icici();
	
		System.out.println(a.getRateOfIntrest());
		System.out.println(b.getRateOfIntrest());
	    System.out.println(c.getRateOfIntrest());
	}
 }



