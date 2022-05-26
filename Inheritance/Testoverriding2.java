package Inheritance;
class Bank5{

	float Getrateofinterest2(){
		return 8f;
		}
}
class Sbi2 extends Bank5{
	float Getrateofinterest2() {
		return 9.5f;
	}
}
class Axis2 extends Bank5{
	float Getrateofinterest2() {
		return 8.6f;
	}
}
class Kotak extends Bank5{
	float Getrateofinterest2() {
		return 7.3f;
	}
	
	}
	public class Testoverriding2 {
	public static void main(String[]args) {
	
		Sbi2 s= new Sbi2();
         Axis2 a=new Axis2();
        Kotak K=new Kotak();
		System.out.println("intrest rate of bank is : "+s.Getrateofinterest2()+" %");
		System.out.println("intrest rate of bank is : "+a.Getrateofinterest2()+" %");
		System.out.println("intrest rate of bank is : "+K.Getrateofinterest2()+" %");
	       
	}

}
