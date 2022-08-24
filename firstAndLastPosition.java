import java.util.Arrays;

//34. Find First and Last Position of Element in Sorted Array
public class firstAndLastPosition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {5,7,7,8,8,10};
		int target = 8;
		System.out.println(Arrays.toString(searchRange(arr,target)));
	}
	
	public static int[] searchRange(int[] nums, int target) {
        int[]arr = new int[2];
        arr[0]= first(nums,target);
        arr[1]= last(nums,target);
        return arr;
    }
    
    public static int first(int[]nums, int target){  
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
                end = mid -1;
            }
        }
        return index;
    }
    
     public static int last(int[]nums, int target){  
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
                start = mid +1;
            }
        }
        return index;
    }
	
//		brute force solution
//		int[]ans = {-1,-1}; 
//		for(int i=0; i<nums.length;i++) {
//			if(nums[i]==target) {
//				ans[0]=i;
//				break;
//			} 
//		}
//		
//		for(int i=nums.length-1; i>=0;i--) {
//			if(nums[i]==target) {
//				ans[1]=i;
//				break;
//			} 
//		}
//		
//		return ans;
//        
//    

}
