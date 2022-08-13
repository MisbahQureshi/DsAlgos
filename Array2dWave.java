
public class Array2dWave {

	public static void main(String[] args) {
		int[][] arr = { { 1, 2, 3, 4 }, 
						{ 8, 7, 6, 5 }, 
						{ 9, 10, 11, 12 },
						{16,15,14,13} };

	    int left = 0;
	    int top = 0;
	    int right = arr.length - 1;
	  
	    int totalvalues = 16;    
	    int count = 0;

	    while (count < totalvalues) {

	        for (int i = left; i <= right; i++) {
	          System.out.print(arr[top][i]+" ");
	          count++;
	        
	      }
	      top++;

	        for (int i = right; i >= left; i--) {
	          System.out.print(arr[top][i]+" ");
	          count++;
	      }
	      top++;

	    }
	  }

}
