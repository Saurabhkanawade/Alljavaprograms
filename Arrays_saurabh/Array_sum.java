package Arrays_saurabh;

public class Array_sum {
	
	public static void main(String[] args) {
		
	int sum=0;
	int avg=0;
	int arr[]=new int[]{35,23,52,52,62};
	
	for(int i=0;i<arr.length;i++) {
		
		 sum=sum+arr[i];
		
         avg=sum/arr.length;		 
	}
	
	System.out.println("the sum of the array : "+sum);
	System.out.println("The avg of the array : "+avg);
	
	
	}
}
