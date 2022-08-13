import java.util.Arrays;

//1929. Concatenation of Array
public class ConcatenationofArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {1,2,1};
		System.out.println(Arrays.toString(getConcatenation(nums)));

	}
	
	public static int[] getConcatenation(int[] nums) {
		int n= nums.length;
		int[] ans = new int[ 2 * n];
		
		for(int i =0; i < n ;i++) {
			ans[i] = nums[i];
			ans[i + n]= nums[i];
			
			
		}
        return ans;
    }

}
