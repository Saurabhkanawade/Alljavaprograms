package Arrays_saurabh;

public class Array5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int array[]=new int[] {1,2,3,4,5};
		
		
		System.out.println("increment order :");
		for(int i=0;i<array.length;i++){
			
			System.out.println(" "+array[i]);
		}
		System.out.println();
		
		
		System.out.println("Decrement order");
    for(int i=array.length-1;i>=0;i--) {
    	
    	System.out.println(" "+array[i]);
    }

}
}