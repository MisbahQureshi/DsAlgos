//53. Maximum Subarray
public class MaximumSubarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = {1};
		System.out.println(maxSubArray(arr));
	}
	
	 public static int maxSubArray(int[] nums) {
		 int max = Integer.MIN_VALUE;
		 
		 for(int i=0; i<nums.length;i++) {
			 int ans=0;
			 for(int j=i; j<nums.length; j++) {
				 ans += nums[j];
				 
				 max = Math.max(ans, max);
			 }
			 
		 }
		 
		return max;
	        
	    }

}
