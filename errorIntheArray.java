import java.util.Arrays;

public class errorIntheArray {

	public static void main(String[] args) {
		int[] arr = {1,1};
        System.out.println(Arrays.toString(findErrorNums(arr)));

	}
	
	 static int[] findErrorNums(int[] nums) {
		 int i=0;
		 int duplicate = -1;
		 int missing = -1;
		 while(i<nums.length) {
			 int correctIndex = nums[i]-1;
			
			 if(nums[i]!=nums[correctIndex]) {
				 int temp = nums[i];
				 nums[i]=nums[correctIndex];
				 nums[correctIndex]= temp;
			 }else i++;
		 }
		 
		 for (int j = 0; j < nums.length; j++) {
				if(nums[j]!=j+1) {
					duplicate = nums[j];
					missing = j+1;
				}
			}
		 
		  return new int[]{duplicate, missing};
	    }

}
