import java.util.Arrays;

public class HeightChecker {

	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5};
		System.out.println(heightChecker(arr));

	}
	
	static int heightChecker(int[] heights) {
		 int newHeights[] = new int[heights.length];
	        for(int i=0; i<heights.length; i++) {
	            newHeights[i]=heights[i];
	        }
	        Arrays.sort(heights);
	        int count=0;

	        for(int i=0; i<heights.length; i++) {
	            if(heights[i]!=newHeights[i]) {
	                count++;
	            }
	        }

	        return count;
        
    }

}
