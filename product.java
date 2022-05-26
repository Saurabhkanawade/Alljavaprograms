import java.util.Scanner;

public class product {

	public static void main(String[] args) {
		
	
	 Scanner s=new Scanner(System.in);
	 
	 System.out.println("Enter the no ");
	 
	 int n=10;
	 int no=s.nextInt();
	 
	 for(int i=1;i<=n;i++) {
		 
		int sum=no*i;
		
		System.out.print(" "+sum);
	 }
	}
}
