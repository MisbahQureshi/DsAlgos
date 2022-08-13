import java.util.Arrays;

//1470. Shuffle the Array
public class ShuffletheArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {2,5,1,3,4,7};  //[2,3,5,4,1,7].
		System.out.println(Arrays.toString(shuffle(nums,3)));
	}
	
	public static int[] shuffle(int[] nums, int n) {
		int[] ans = new int[2*n];
		int j=0;
		for(int i = 0; i<2*n;i+=2) {
			ans[i]=nums[j];
			ans[i+1] = nums[j+n];
			j++;
		}
		
        return ans;
    }

}
