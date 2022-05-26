package Assignment;
import java.util.Scanner;

public class check_Squre_or_not {
	
	public static void main(String[] args) {

		int length , breadth , Area;
		
		Scanner s=new Scanner(System.in);
	
		System.out.println("Enter the Length");
		length=s.nextInt();
		
		System.out.println("Enter the breadth");
		breadth=s.nextInt();
		
		
		Area = length * breadth;

		if(length == breadth) {
			
			System.out.println("This is A Square and Area of it's is :"+Area);
		}
		
		else {
			
			System.out.println("This is Rectangle and Area of it's is :"+Area);
		}
		
	}
}
