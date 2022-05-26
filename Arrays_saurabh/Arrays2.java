package Arrays_saurabh;

//import java.util.Scanner;

public class Arrays2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		  int arr1[]=new int [] {1,2,3,4,5};
		  int arr2[]=new int [arr1.length];
		  
		  for(int i=0;i<arr1.length;i++) {
			  
			  arr2[i]=arr1[i];
		  }
		  
		  System.out.println("Elements of an orignal the array is :");
		
		  for(int i=0;i<arr1.length;i++) {
			  
			  System.out.print(" "+arr1[i]);
			}
		  System.out.println();
		
		System.out.println("elements of an second Arrays is :");
		for(int i=0;i<arr2.length;i++) {
			
			System.out.print(" "+arr2[i]);
		}
		
		  
	}

}



