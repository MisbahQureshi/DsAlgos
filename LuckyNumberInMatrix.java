import java.util.ArrayList;
import java.util.List;
//1380. Lucky Numbers in a Matrix
public class LuckyNumberInMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr = {	{3,7,8},
						{9,11,13},
						{15,16,17}
				};
		
		System.out.println(luckyNumbers(arr));

	}
	
	 public static List<Integer> luckyNumbers (int[][] matrix) {
		 List<Integer> list = new ArrayList<>();
		 
		 for(int i=0;i<matrix.length;i++) {	
			 
			 int min = Integer.MAX_VALUE;		
			 int index =0;
			 for(int j=0; j<matrix[i].length;j++) {
				 if(matrix[i][j]<min) {
				 min = matrix[i][j];
				 index = j;
				 }
			 }		
			 int max = 0;
			 for(int j=0; j<matrix.length;j++) {
				 if(matrix[j][index]>max) {
				 max =  matrix[j][index];
				 }
			 }	
			 
			 if(max==min) {
				 list.add(max);
				 }
		 }
		 
		return list;
	        
	    }
}
