package Arrays_saurabh;

import java.util.Scanner;

public class Array9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int min=Integer.MAX_VALUE;
		
		Scanner r=new Scanner (System.in);
		System.out.println("Enter the size of an array");
		int n=r.nextInt();
		
		System.out.println("Enter the values in the array");
		int a[]=new int [n];
		
           		
		for(int i=0;i<a.length;i++) {
			
			a[i]=r.nextInt();
			
			if(a[i]<min) {
				           
				min=a[i];
			}
		}
		r.close();
		System.out.println("the manimum no in the array :"+min);
	 
	}
}
