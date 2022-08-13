import java.util.Arrays;
import java.util.Scanner;

public class HouseRobber {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int[] nums = new int[n];
		
		for(int i = 0; i<nums.length; i++) {
			nums[i] = scn.nextInt();
			}
		
		System.out.println(rob(nums));

	}
	
	public static int rob(int[]nums) {
		int dp[]= new int[nums.length];
		Arrays.fill(dp, -1);
		return helper(0,nums,dp);
	}
	
	public static int helper(int x, int[]nums, int[]dp) {
		
		if(x>nums.length-1) {return 0;}
		if(dp[x]!= -1) {return dp[x];}
		
		int steal = nums[x] + helper(x+2, nums, dp);
		int skip = helper (x+1, nums, dp);
		
		return dp[x] = Math.max(steal, skip);
		
	}

}
