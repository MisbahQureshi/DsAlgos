public class RotateAnArray {

	public static void main(String[] args) {
		int[][] arr = {
				{0,1},
				{1,0},};
		
		int[][] target = {
				{1,0},
				{0,1}};

			System.out.println(findRotation(arr,target));		
	}
	

	    static boolean findRotation(int[][] mat, int[][] target) {
	         for(int i=0; i<4; i++) {
	        	if(same(mat,target)) {
	        		return true;
	        	} else {
	        		mat = rotate(mat);}
	        }
	        return false;
	    }
	    
	    
	    static int[][] rotate(int[][] mat) {
	    	 int rows=mat.length;
	         int columns=mat[0].length;
	         int[][] newArr = new int[columns][rows];

	         for(int i=0; i<rows;i++){
	             for(int j=0; j<columns;j++){
	                 newArr[j][i]=mat[i][j];
	             }
	         }
	         
	         int r=newArr.length;
	         int c=newArr[0].length;
	         int[][] newArr2 = new int[r][c];
	         for(int i=0; i<r;i++){
	        	 int k=0;
	             for(int j=c-1; j>=0;j--){
	                 newArr2[i][k]=newArr[i][j];
	                 k++;
	             }
	         }
	         
	         return newArr2;
		}

		static boolean same(int[][] mat, int[][] target) {
			if(mat.length == target.length && mat[0].length==target[0].length) {
				for(int i=0; i<mat.length;i++) {
					for(int j=0; j<mat[0].length;j++) {
						if(mat[i][j]!=target[i][j]) return false;
						
					}
				}
			}
			return true;
	}
	}
