import java.util.Arrays;

//1480. Running Sum of 1d Array

//Input: nums = [3,1,2,10,1]
//Output: [3,4,6,16,17]

public class RunningSumofArray {

	public static void main(String[] args) {
		int[] nums = {3,1,2,10,1};
		System.out.println(Arrays.toString(runningSum(nums)));

	}
	
	 public static int[] runningSum(int[] nums) {
	        //sum(nums[0]…nums[i])
		 for(int i = 1; i<nums.length; i++) {
			 nums[i] = nums[i] + nums[i-1];
		 }
		 
		 return nums;
	    }
	 
	
}
