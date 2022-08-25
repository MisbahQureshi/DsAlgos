//amazon Question
public class InfiniteArrayBinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {3,5,7,9,10,90,100,130,140,160};
		int target = 10;
		
		System.out.println(ans(arr, target));

	}
	
	
	
	public static int ans(int[] nums, int target) {
		int start = 0;
		int end =1;
		
		while(target>nums[end]) {
			int newStart = end+1;
			end = end + (end - start +1) *2;
			start = newStart;
		}

		return binarysearching(nums, target, start,end);
	}
	
	public static int binarysearching(int[] nums, int target, int start, int end) {
		while(start<=end) {
			int mid = start + (end-start)/2;
			 if(nums[mid]<target){
	                start = mid+1;
	            }
	            else if(nums[mid]>target){
	                end = mid-1;
	            }
	            else{
	                return mid;
	                
	            }
			}
		return -1;
	
	}

}
