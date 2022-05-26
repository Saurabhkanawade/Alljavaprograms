package Interview_questions;

public class Find_min_max_string {

	public static void main(String[] args) {
	
		/*
    int max=0;
    
    int min=0;
    int temp;
		
		int arr[]= {9,4,7,3,9,10,3,2,1,0};

		for(int i=0;i<arr.length;i++) {
			
			for(int j=i+1; j<arr.length;j++) {
				
			   if(arr[i]>arr[j]) {
				temp=arr[i];
		        arr[i]=arr[j]; 		
				arr[j]=temp;
			   }
			}
		}
	
System.out.println();

for(int i=0;i<arr.length;i++) {
	
	System.out.print(arr[i]);
}

*/
		
		String s="One ,two ,three , four ,five, six,Hundread,seven,nine,ten";
		
		String data=s.replace("One", "Hundread");
		
		System.out.println(data);
				
	}
}


