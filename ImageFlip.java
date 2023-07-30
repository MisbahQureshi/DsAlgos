import java.util.Arrays;

public class ImageFlip {

	public static void main(String[] args) {
		int[][] arr = {
				{1,1,0,0},
				{1,0,0,1},
				{0,1,1,1},
				{1,0,1,0}};

		for(int[] a : flipTheImage(arr)) {
			System.out.println(Arrays.toString(a));
		}
		
	}
	
	static int[][] flipTheImage(int[][] arr){
		int row=arr.length;
		int col=arr[0].length;
		int[][] newArr = new int[row][col];
		for(int i=0; i<row;i++) {
			int k=0;
			for(int j=col-1; j>=0;j--) {
				newArr[i][k]= arr[i][j];
				k++;
			}
		}
		
		for(int i=0; i<newArr.length;i++) {
			for(int j =0;j<newArr[0].length;j++) {
				if(newArr[i][j]==1)newArr[i][j] = 0;
				else newArr[i][j]=1;
			}
		}
		return newArr;
	}

}
