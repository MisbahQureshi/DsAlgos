
public class ArraySpiral {

	public static void main(String[] args) {
		int[][] arr = { { 1, 2, 3, 4 }, 
				{ 5, 6, 7, 8 }, 
				{ 9, 10, 11, 12 },
				{13,14,15,16} };

	    int left = 0;
	    int top = 0;
	    int right = arr.length - 1;
	    int bottom = arr[0].length - 1;


	    int totalvalues = 16;  
	    int count = 0;

	    while (count < totalvalues) {

	        for (int i = left; i <= right; i++) {
	          System.out.print(arr[top][i]+" ");
	          count++;
	      }
	      top++;

	        for (int i = top; i <= bottom; i++) {
	          System.out.print(arr[i][right]+" ");
	          count++;
	      }
	      right--;
	      
	        for (int i = right; i >= left; i--) {
	          System.out.print(arr[bottom][i]+" ");
	          count++;
	      }
	      bottom--;
	      
	        for (int i = bottom; i >= top; i--) {
	          System.out.print( arr[i][left]+" ");
	          count++;
	      }
	     left++;
	    }
	  }
	
}
