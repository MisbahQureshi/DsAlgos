//33. Search in Rotated Sorted Array
public class RotatedBinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {4,5,6,7,0,1,2};
		
		System.out.println(search(arr,6));

	}
	
	public static int search(int[]nums, int target) {
		int pivot = findPivot(nums);
		if(pivot==-1) {
			return binarySearching(nums,target,0,nums.length-1);
		}
		
		if(nums[pivot]==target) {
			return pivot;
		}
		
		if(target>=nums[0]) {
			return binarySearching(nums,target,0,pivot-1);
		}
		
		return binarySearching(nums,target,pivot+1,nums.length-1);
	}
	
	public static int findPivot(int []arr) {
		int start =0;
		int end = arr.length-1;
		while(start<=end) {
			int mid = start + (end-start)/2;
			
			if(mid<end && arr[mid]>arr[mid+1]) {
				 return mid;
			} 
			
			if(mid>start && arr[mid]<arr[mid-1]) {
				 return mid-1;
			} 
			
			if(arr[mid]<=arr[start]) {
				end = mid-1;
			} else {
				start = mid+1;
			}
			
		}
		
		return -1;
	}
	
	public static int binarySearching(int[]nums, int target, int start, int end){  
      
        while(start<=end){
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
