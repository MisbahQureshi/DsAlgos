import java.util.Arrays;

public class SpiralMatrix2 {

	public static void main(String[] args) {
		int n = 3; 	
		
		for(int[] a : spiralOrder(n)) {
			System.out.println(Arrays.toString(a));
		}
		

	}
	
	static int[][] spiralOrder(int n) {
		int[][] newArr = new int[n][n];
		
		int top=0;
		int bottom = newArr.length-1;
		int left = 0;
		int right = newArr[0].length - 1;
		
		int count =1;
		int direction = 0;
		
		while(top<=bottom && left<=right) {
			if(direction ==0) {
				for (int i = left; i <=right; i++) {
					newArr[top][i] = count;
					count++;
				}
				top++;
			}
			
			if(direction ==1) {
				for (int i = top; i <=bottom; i++) {
					newArr[i][right] = count;
					count++;
				}
				right--;
			}
			
			if(direction == 2){
	             for(int i = right; i >= left; i--){
	                 newArr[bottom][i]=count;
	                 count++;
	             }
	             bottom--;
	         }
			
			if(direction ==3) {
				for (int i = bottom; i >=top; i--) {
					newArr[i][left] = count;
					count++;
				}
				left++;
			}
			
			direction = (direction+1)%4;
		}
		
		return newArr;
        
        
        }

}
