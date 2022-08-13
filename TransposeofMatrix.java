import java.util.Arrays;

//867. Transpose Matrix
public class TransposeofMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[][] arr = {	{1,2,3},
						{4,5,6},
						{7,8,9}
						
				};
		
		for(int[] a : (transpose(arr))) {
			System.out.println(Arrays.toString(a));
		}

	}
	
    public static int[][] transpose(int[][] matrix) {
    	int n = matrix.length;
    	int m= matrix[0].length;
    	int[][] nums = new int[m][n];
    	for(int i=0; i<m;i++) {
    		for(int j=0; j<n;j++) {
    			nums[i][j] = matrix[j][i];
    			
    		}
    	}
    	
    	
    	
    	
		return nums;
        
    }

}
