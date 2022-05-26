package Local_inner_class;

public class Outer {
	
 private void getValue(){
	
	 int sum=20;
	
class Inner{
	
	private int divisor;
	private int reminder;
	
	public Inner(){
		
		divisor=4;
		reminder=sum%divisor;
	}
	
	private int getdivisor() {
		return divisor;
	}
	
	private int getreminder() {
		return sum%divisor;
	}
	
	private int getquetiont() {
		
		System.out.println();
		System.out.println("Inside inner class");
		
		return sum/divisor;
	}}

	Inner i=new Inner();

	System.out.println("The Divisor  is : "+i.getdivisor());
	System.out.println("The Reminder is :"+i.getreminder());
	System.out.println("The Quetiont is :"+i.getquetiont());
		
}
	
  public static void main(String args[]) {
	
	Outer o=new Outer();

	o.getValue();

}
}