import java.util.Arrays;

//1365. How Many Numbers Are Smaller Than the Current Number
public class SmallerThanCurrent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {8,1,2,2,3}; 
		System.out.println(Arrays.toString(smallerNumbersThanCurrent(nums)));

	}
	
	public static int[] smallerNumbersThanCurrent(int[] nums) {
			int[] arr = new int[nums.length];
			int ans;
	        for(int i=0; i<nums.length;i++) {
	        	ans = 0;
	        	for(int j=0;j<nums.length;j++) {
	        		if(nums[i]>nums[j]) {
	        			ans++;
	        			arr[i] = ans;
	        		}
	        		
	        	} 
	        }
		
		
		return arr;
        
    }

}
