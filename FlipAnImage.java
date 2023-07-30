import java.util.Arrays;
//832. Flipping an Image
public class FlipAnImage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] nums = {{1,1,0,},
						{1,0,1},
						{0,0,0}}; 	
		
		for(int[] a : flipAndInvertImage(nums)) {
			System.out.println(Arrays.toString(a));
		}
		}
	
	 public static int[][] flipAndInvertImage(int[][] image) {
		 int row= image.length;
		 int col = image[0].length;
		 int[][] ans = new int[row][col];
		 
		 for(int i= 0; i<row; i++) {
			 int k=0;
				for(int j =col-1; j>=0;j--) {
				ans[i][k] = image[i][j];
				k++;
				}
			}
		 
		 for(int i= 0; i<ans.length; i++) {
				for(int j =0; j<ans[i].length;j++) {
					if(ans[i][j]==0) {
						ans[i][j]=1;
					} else ans[i][j]=0;
				}
				}
		return ans;
	     

}
}
