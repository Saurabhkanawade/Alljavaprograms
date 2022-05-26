package Arrays_saurabh;

import java.util.*;


public class Array3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	//int sum=0;
	Scanner s=new Scanner(System.in);
	System.out.println("Enter the size of an array");
	
	int n=s.nextInt();       //taking n nos from user 
	
	int arr[]=new int[n];   //initi array
  		
	
	
	System.out.println("Enter the values in arryas :");
     
	for(int i=0;i<n;i++) {
		
	arr[i]=s.nextInt();
		
	}
	
	for(int i=0;i<n;i++) {
	
		System.out.println(arr[i]);
	}
	
	}

}
