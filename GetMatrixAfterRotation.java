//1886. Determine Whether Matrix Can Be Obtained By Rotation
public class GetMatrixAfterRotation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr = {{0,1},{1,1}};
		int[][] target = {{1,0},{0,1}};
		
		System.out.println(findRotation(arr,target));
		
	}
	
	public static boolean findRotation(int[][] mat, int[][] target) {
        for(int i=0; i<4; i++) {
        	if(same(mat,target)) {
        		return true;
        	} else {
        		mat = rotate(mat);        	}
        }
        return false;
}

	private static int[][] rotate(int[][] mat) {
		// TODO Auto-generated method stub
		int n= mat.length;
		int m=mat[0].length;
		int[][] rotate = new int[m][n];
		
		for(int i=0;i<m;i++) {
			for(int j=0; j<n; j++) {
				rotate[i][j]=mat[j][n-i-1];
			}
		}
		
		return rotate;
	}

	private static boolean same(int[][] mat, int[][] target) {
		// TODO Auto-generated method stub
		if(mat.length == target.length && mat[0].length==target[0].length) {
			for(int i=0; i<mat.length;i++) {
				for(int j=0; j<mat[0].length;j++) {
					if(mat[i][j]!=target[i][j]) {
						return false;
					}
				}
			}
		}
		return true;
	}
	

	

}
