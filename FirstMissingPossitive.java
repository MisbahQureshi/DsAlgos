import java.util.Arrays;

//41. First Missing Positive
public class FirstMissingPossitive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]arr= {3,4,-1,1};
		System.out.println(firstMissingPositive(arr));
	}
    public static int firstMissingPositive(int[] nums) {
    	 int count=1;
         Arrays.sort(nums);
         for(int i=0;i<nums.length;i++){
             if(nums[i]==count)
                 count++;
         }
         return count;
        
    }
}
