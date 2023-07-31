import java.util.ArrayList;
import java.util.List;

public class SpiralMatrix {

	public static void main(String[] args) {
		int[][] arr = {{1,2,3},
						{4,5,6},
						{7,8,9}}; 	
		
		System.out.println(spiralOrder(arr));

	}
	
	static List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> list = new ArrayList<>();
        
         int top = 0;
		 int bottom = matrix.length-1;
		 int left = 0;
		 int right = matrix[0].length-1;
		 
		 int direction = 0;
		 
		 while(top <= bottom && left <= right){

		         if(direction == 0){
		             for(int i = left; i <= right; i++){
		                 list.add(matrix[top][i]);
		             }
		             top++;
		         }
		         
		         if(direction == 1){
		             for(int i = top; i <= bottom; i++){
		                 list.add(matrix[i][right]);
		             }
		             right--;
		         }
	         
		         if(direction == 2){
		             for(int i = right; i >= left; i--){
		                 list.add(matrix[bottom][i]);
		             }
		             bottom--;
		         }
		         
		         if(direction == 3){
		             for(int i = bottom; i >= top; i--){
		                 list.add(matrix[i][left]);
		             }
		             left++;
		         }
	         
	         direction = (direction+1)%4;
		     }
		     return list;
        }

}
