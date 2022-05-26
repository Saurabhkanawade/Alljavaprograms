
public class Min_max {
	
	public static void main(String[] args) {
		
		int max=Integer.MIN_VALUE;
		
		int arr[]= {43,34,4612,464,54376357,4,7345,734,14,6,575,2};
		
		for(int i=0;i<arr.length;i++) {
			
			if(arr[i]>max) {
				
				max=arr[i];
			}
		}
		
		System.out.println(max);
	}

}
