import java.util.Arrays;

//75 sort colors
public class SortColors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {2,0,2,1,1,0};
		sortColors(nums);
	}
	
	public static void sortColors(int[] nums) {
        
        int len=nums.length;
        while(len>0) {
        	for(int i=0; i<nums.length-1;i++) {
        		if(nums[i]>nums[i+1]) {
        			int temp = nums[i+1];
        			nums[i+1]=nums[i];
        			nums[i]=temp;
        		}
        	}
        	
        	len--;
        } System.out.println(Arrays.toString(nums));
        
        
    }

}
