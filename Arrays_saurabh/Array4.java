package Arrays_saurabh;

import java.util.Scanner;

public class Array4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int sum=0;
	Scanner s=new Scanner(System.in);
	System.out.println("Enter the size of an array");
	
	int n=s.nextInt();       //taking n nos from user 
	
	int arr[]=new int[n];   //initi array
  		s.close();
	System.out.println("Enter the values in arryas :");
	
	
	for(int i=0;i<n;i++) {
		
	arr[i]=s.nextInt();
	sum=sum+arr[i];
	}
	
	System.out.println("sum :"+sum);
	
	}

}
