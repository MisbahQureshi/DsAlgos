import java.util.Arrays;
//59. Spiral Matrix II
public class SpiralMatrix2 {

	public static void main(String[] args) {
		
		int n = 3;
		for(int[] a : generateMatrix(n)) {
			System.out.println(Arrays.toString(a));
		}

	}
	
	 public static int[][] generateMatrix(int n) {
		int [][] matrix = new int[n][n];
		 int top = 0;
		 int bottom = matrix.length-1;
		 int left = 0;
		 int right = matrix[0].length-1;
		 int count =1;
		 
		 int direction = 0;
		 
		 while(top <= bottom && left <= right){

		         if(direction == 0){
		             for(int i = left; i <= right; i++){
		                 matrix[top][i] = count;
		                 count++;
		             }
		             top++;
		         }
		         
		         if(direction == 1){
		             for(int i = top; i <= bottom; i++){
		                 matrix[i][right] = count;
		                 count++;
		             }
		             right--;
		         }
		         
		         if(direction == 2){
		             for(int i = right; i >= left; i--){
		                 matrix[bottom][i]=count;
		                 count++;
		             }
		             bottom--;
		         }
		         
		         if(direction == 3){
		             for(int i = bottom; i >= top; i--){
		                 matrix[i][left]=count;
		                 count++;
		             }
		             left++;
		         }
		         
		         direction = (direction+1)%4;
		     }
		 return matrix;
	        
	    }

}
