import java.util.Arrays;
//189 rotate array
public class RotateOneDArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,2,3,4,5,6,7};
		int k = 8;
		rotate(arr,k);
	}
	
	public static void rotate(int[] nums, int k) {
			k=k%nums.length;
			while(k>0) {
				for(int i=nums.length-1;i>0;i--) {
					int temp = nums[i];
					nums[i] = nums[i-1];
					nums[i-1] = temp;
				}
				
				k--;
			}
		  System.out.println(Arrays.toString(nums));
        
    }

}
