
public class Min_no {
	
	public static void main(String[] args) {
		
		int arr[]= {4,62,42,4,1,446,8,9,9,1};
		
		int min=Integer.MAX_VALUE;
		
		for(int i=0;i<arr.length;i++) {
			
			if(arr[i]<min) {
				
				min=arr[i];
			}
		}
		System.out.println(min);
	}

}
