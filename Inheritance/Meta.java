package Inheritance;

public class Meta {
	
	void data() {
		
		System.out.println("it is a one of the most popular company facebook his parent company");
	}
}
class Facebook extends Meta{
	
	void datas() {
		
		System.out.println("This is the most popular social media website where you can chat and communicate with your friends ");
	}

	
	public static void main(String[] args) {
		
		Facebook f=new Facebook();
		
		f.datas();
		
	}
}