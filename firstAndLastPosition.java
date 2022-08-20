import java.util.Arrays;

//34. Find First and Last Position of Element in Sorted Array
public class firstAndLastPosition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {5,7,7,8,8,10};
		int target = 6;
		System.out.println(Arrays.toString(searchRange(arr,target)));
	}
	
	public static int[] searchRange(int[] nums, int target) {
		int[]ans = {-1,-1}; 
		for(int i=0; i<nums.length;i++) {
			if(nums[i]==target) {
				ans[0]=i;
				break;
			} 
		}
		
		for(int i=nums.length-1; i>=0;i--) {
			if(nums[i]==target) {
				ans[1]=i;
				break;
			} 
		}
		
		return ans;
        
    }

}
