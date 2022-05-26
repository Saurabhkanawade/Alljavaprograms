package Arrays_saurabh;

public class Array7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int max=0;   
		
		int array[]=new int[] {1,2,3,4000,4,5,55,44};
		
	  for(int i=0;i<array.length;i++) {
		  
		  System.out.print(" "+array[i] );
	  }
		System.out.println();
		
	System.out.println(" The max no is :");	
      
	for(int no:array) {
    	
    	  if(no>max) 
		
		max=no;
		}
	
				
		System.out.println(" "+max);
	}
	}