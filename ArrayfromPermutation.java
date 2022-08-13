import java.util.Arrays;

//1920. Build Array from Permutation

public class ArrayfromPermutation {

	public static void main(String[] args) {
		int[] nums = {0,2,1,5,3,4};
		System.out.println(Arrays.toString(buildArray(nums)));

	}
	
	 public static int[] buildArray(int[] nums) {
		 int[] arr = new int[nums.length];
		 for(int i = 0; i<nums.length; i++) {
			 arr[i] = nums[nums[i]];
		 }
		 	return arr;
	    }

}
