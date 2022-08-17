import java.util.Arrays;

//26. Remove Duplicates from Sorted Array
public class RemoveDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {0,0,1,1,1,2,2,3,3,4};
		System.out.println(removeDuplicates(arr));

	}
	
	 public static int removeDuplicates(int[] nums) {
		 int count =1;
	        for(int i=0; i<nums.length-1; i++){
	            if(nums[i]!=nums[i+1]){
	                nums[count]=nums[i+1];
	                  count++;
	            }
	        }
	        return count;
	        
	    }

}
