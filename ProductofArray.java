import java.util.Arrays;

//238. Product of Array Except Self
public class ProductofArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,2,3,4};	
		//24,12,8,6
		System.out.println(Arrays.toString(productExceptSelf(arr)));

	}
	
	public static int[] productExceptSelf(int[] nums) {
        int[] ans = new int[nums.length];
        
        ans[0] = 1;
        for (int i=1; i < nums.length; i++) {
            ans[i] = ans[i-1] * nums[i-1];
        }
        int product = 1;
        for (int i=nums.length-1; i >= 0; i--) {
            ans[i] *= product;
            product*= nums[i];
        }
       
        return ans;

        
    }

}
