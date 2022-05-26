package Exception_Nested_try_block;

public class Demo2 {

	public static void main(String[] args) {
	
		try {
			
			int a[]=new int[5];
			
			System.out.println(a[10]);
		        
		    try{
		    
		    	int s=50/0;
		    }
		    	
		    catch(ArithmeticException v) {
		    	
		    	System.out.println("Exception handle by Arithmetic Exception");
		     }
		}
		    
	   catch(ArrayIndexOutOfBoundsException s) {
		   
		   System.out.println("Exception handle by an Array index out of bound");
	   }
	System.out.println("Rest of the code");
		    
	}
	}
