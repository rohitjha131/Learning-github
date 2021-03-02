package pattern;

public class Sortingnumber {
	
	
	public void sorting(int arr[]) {
		 int n = arr.length;  
	        int temp = 0;  
	         for(int i=0; i < n; i++){  
	                 for(int j=1; j < (n-i); j++){  
	                          if(arr[j-1] > arr[j]){  
	                                 //swap elements  
	                                 temp = arr[j-1];  
	                                 arr[j-1] = arr[j];  
	                                 arr[j] = temp;  
	                         }  
	                          
	                 }}
	}

	public static void main(String[] args) {
		 int[] arr = new int[]{ 3,40,60,74,3,6,90,15 }; 
		 Sortingnumber t=new Sortingnumber();
		 t.sorting(arr);
		  System.out.println("Array After Bubble Sort");  
          for(int i=0; i < arr.length; i++){  
                  System.out.print(arr[i] + " ");  
          }  
	}

}
