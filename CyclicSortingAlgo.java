import java.util.Arrays;

public class CyclicSortingAlgo {

	public static void main(String[] args) {
		 int[] arr = {5, 3, 4, 1, 2};
	        cyclicAlgo(arr);
	        System.out.println(Arrays.toString(arr));

	}
	
	static void cyclicAlgo(int[] arr) {
       int i =0;
       while(i<arr.length) {
    	   int correctIndex = arr[i]-1;
    	   if(arr[i] !=arr[correctIndex]) {
    		   int temp = arr[i];
   	        	arr[i] = arr[correctIndex];
   	        	arr[correctIndex] = temp;
    	   } else i++;
       }
    }

}
