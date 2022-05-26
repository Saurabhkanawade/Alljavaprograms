
public class Char_pyramid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   int alphabet=65;
       
   for(int i=10;i>=0;i--) {
	   
	   for(int j=0;j<=i;j++) {
		   
		   System.out.print((char)(alphabet+j)+" ");
	   }
   System.out.println();
   }
   
      
   for(int i=1;i<=10;i++) {
	   
	  for(int j=0;j<=i;j++) {
	  
	System.out.print((char)(alphabet+j)+" ");
	}
 System.out.println();
}
}
}