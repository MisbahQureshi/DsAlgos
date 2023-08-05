
public class SearchInsert {

	public static void main(String[] args) {
		int[]arr= {1,3,5,6};
		int target = 7;
		System.out.println(searchInsert(arr,target));

	}
	 static int searchInsert(int[] arr, int target) {
		 int start=0;
		 int end=arr.length-1;
		 int mid=-1;
		 
		 while(start<=end) {
			 mid = start + (end-start)/2;
			 if(arr[mid] == target) return mid;
			 if(arr[mid]>target)end=mid-1;
			 else start=mid+1;
		 }
		return start;
	        
	    }

}
