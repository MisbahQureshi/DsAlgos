import java.util.Arrays;

public class MajorityElement {

	public static void main(String[] args) {
		int[] arr = {3,3,4};
		System.out.println(majorityElement(arr));
	}
	
	 static int majorityElement(int[] nums) {
		 Arrays.sort(nums);
		 int count = 1;
		 for (int i = 0; i < nums.length; i++) {
			 if(count > (nums.length/2)){
	                return nums[i];
	            }
	            if(nums[i] == nums[i+1]){
	                count++;
	            }else{
	                count = 1;
	            }
	        }
	        return 0;
	 }

}
