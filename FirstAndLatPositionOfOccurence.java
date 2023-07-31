import java.util.Arrays;

public class FirstAndLatPositionOfOccurence {

	public static void main(String[] args) {
		int[] nums= {5,7,7,8,8,10};
		int target = 8;
		System.out.println(Arrays.toString(searchRange(nums,target)));
	}
	
	static int[] searchRange(int[] nums, int target) {
		
        int[]arr = new int[2];
        arr[0]= first(nums,target,true);
        arr[1]= first(nums,target,false);
        return arr;
    }
    
    static int first(int[]nums, int target, boolean isStartIndex){  
        int start=0;
        int end = nums.length-1;
        int index = -1;
        
        while(start<=end){
            int mid = start + (end-start)/2;
            if(nums[mid]<target){
                start = mid+1;
            }
            else if(nums[mid]>target){
                end = mid-1;
            }
            else{
                index = mid;
                if(isStartIndex) end = mid -1;
                else start = mid +1;
            }
        }
        return index;
    }

}
