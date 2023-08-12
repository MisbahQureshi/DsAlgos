
public class FindDuplicateNumbers {

	public static void main(String[] args) {
		int[] arr = {3,1,3,4,2};
        System.out.println(findDuplicate(arr));

	}
	
	 static int findDuplicate(int[] nums) {
		 int number =0;
		 int i=0;
		 while(i<nums.length) {
			 int correctIndex = nums[i]-1;
			 if(nums[i]==nums[correctIndex]) {
				 number = nums[i];
			 }
			 if(nums[i]!=nums[correctIndex]) {
				 int temp = nums[i];
				 nums[i]=nums[correctIndex];
				 nums[correctIndex]= temp;
			 }else i++;
		 }
		 return number;
	 }

}
