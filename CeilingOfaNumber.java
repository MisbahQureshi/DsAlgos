
public class CeilingOfaNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {2,3,5,9,14,16,18};
		int target = 15;
		System.out.println(ceilingOfANumber(arr,target));

	}
	
	public static int ceilingOfANumber(int[]nums, int target) {
		int start = 0;
		int end = nums.length-1;
		
		
		
		while(start<=end) {
			int mid = start + (end - start)/2;
			
			if(target>nums[nums.length-1]) {return -1;}
			
			if(target<nums[mid]) {
				end=mid-1;
			}
			
			else if(target>nums[mid]) {
				start=mid+1;
				
			}
			
			else  {
				return nums[mid];
			}
			
			
		}
		
		
		return nums[start];
		}

}
