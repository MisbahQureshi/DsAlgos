public class OddCells {

	public static void main(String[] args) {
		int m=2;
		int n=3;
		int[][] indices = {{0,1},
						  {1,1}};
		
//		for(int[] a : oddCells(m,n,indices)) {
//			System.out.println(Arrays.toString(a));
//		}
		
		System.out.println(oddCells(m,n,indices));
	}
	
	static int oddCells(int m, int n, int[][] indices) {
		int[][] newArr = new int[m][n];
		for(int i=0;i<indices.length;i++) {
				for(int k = 0; k<n;k++) {
					int row = indices[i][0];
						newArr[row][k]+=1; 
					}
				for(int k = 0; k<m;k++) {
					int row = indices[i][1];
						newArr[k][row]+=1; 
					}
				}
		int count =0;
		for(int i=0; i<m;i++) {
			for(int j=0; j<n; j++) {
				if(newArr[i][j]%2 !=0)count++;
			}
		}
			
		
        return count;
    }

}
