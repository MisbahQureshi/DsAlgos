import java.util.Arrays;
import java.util.Scanner;

public class DeleteAndEarn {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int[] nums = new int[n];
		
		for(int i = 0; i<nums.length; i++) {
			nums[i] = scn.nextInt();
			}
		
		System.out.println(delete(nums));
	}
	
	public static int delete(int[]nums) {
		int max = 0;
		for(int i= 0; i<nums.length; i++) {
			max = Math.max(nums[i], max);
		}
		
		int[] values = new int[max+1];
		for(int x: nums) {
			values[x]+=x;
		}
		int dp[]= new int[values.length];
		Arrays.fill(dp, -1);
		return helper(0,values,dp);
		
	}
	
	public static int helper(int x, int[]values, int[]dp) {
		
		if(x>values.length-1) {return 0;}
		if(dp[x]!= -1) {return dp[x];}
	
		int p = values[x] + helper(x+2, values,dp);
		int q = helper (x+1, values,dp);
		
		return dp[x] = Math.max(p, q);
		
	}

}
