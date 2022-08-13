import java.util.Arrays;
//832. Flipping an Image
public class FlipingAnImage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr = {	{1,1,0},
						{1,0,1},
						{0,0,0}
								};
		
		
		for(int[] a : flipAndInvertImage(arr)) {
			System.out.println(Arrays.toString(a));
		}

	}
	
	 public static int[][] flipAndInvertImage(int[][] image) {
		 for(int row=0; row<image.length; row++) {
			 int i=0;
			 int j=image.length-1;
			 while(i<=j) {
				 int temp = image[row][i];
				 image[row][i] = image[row][j];
				 image[row][j]=temp;
				 i++;
				 j--;
			 }
			 for(int col = 0; col<image[row].length; col++) {
				 if(image[row][col]==0) {
					 image[row][col]=1; 
				 } else
					 image[row][col]=0;
			 }
		 }
		 
	        return image;
	    }

}
