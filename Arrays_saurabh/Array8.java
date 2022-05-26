package Arrays_saurabh;

public class Array8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int max=Integer.MIN_VALUE;   
		
		int array[]=new int[] {1,2,3,4000,4,5,55,44};
		
	  for(int i=0;i<array.length;i++) {
	
		  
	 	  if(array[i]>max) 
		
		max=array[i];
		}
	
				
		System.out.println("The maximum no is :"+max);
	}
	}