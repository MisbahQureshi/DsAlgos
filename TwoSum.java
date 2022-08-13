import java.util.Arrays;

//1 Two Sum
public class TwoSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {2,7,11,15};
		int target = 9;
		
		System.out.println(Arrays.toString(twoSum(nums,target)));

	}
	
	public static int[] twoSum(int[] nums, int target) {
		int[] arr = new int[2];
		for(int i=0; i<nums.length; i++) {
			for(int j=i+1; j<nums.length; j++) {
				int result = nums[i] + nums[j];
				if(result == target) {
					arr[i] = i;
					arr[i+1]=j;
				}
			}
		}
		
		
		return arr;
        
    }

}
