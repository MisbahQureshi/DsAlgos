import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//73. Set Matrix Zeroes
public class SetMatrixToZero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr = {
				{0,1,2,0},
				{3,4,5,2},
				{1,3,1,5}
		};
		
		for(int[] a: setZeroes(arr)) {
			System.out.println(Arrays.toString(a));
		}	
		}
	
    public static int[][] setZeroes(int[][] matrix) {
    	int n=matrix[0].length;
    	int m = matrix.length;
    	List<Integer> row = new ArrayList<>();
    	List<Integer> col = new ArrayList<>();
    	for(int i=0; i<m;i++) {
    		for(int j=0; j<n;j++) {
        		if(matrix[i][j]==0) {
        			row.add(i);
        			col.add(j);
        			
        		}
        		
        	} 
    		
    	} 
    	for(int i=0; i<row.size();i++) {
    		for(int j=0; j<n;j++) {
        		matrix[row.get(i)][j]=0;
        		
        	} 
        
    } for(int i=0; i<col.size();i++) {
		for(int j=0; j<m;j++) {
    		matrix[j][col.get(i)]=0;
    		
    	} 
    
}    

    return matrix;
    
}
}
