import java.util.Arrays;

//1512. Number of Good Pairs
public class NumberofGoodPairs {
//[1,2,3,1,1,3] 
	//4
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {1,2,2,3,3,1}; //
		System.out.println(numIdenticalPairs(nums));
	}
	
	public static int numIdenticalPairs(int[] nums) {
        int ans = 0;
        for(int i=0; i<nums.length;i++) {
        	for(int j=i+1;j<nums.length;j++) {
        		if(nums[i]==nums[j]) {
        			ans++;
        		}
        	}
        }
		
		return ans;
    }

}
