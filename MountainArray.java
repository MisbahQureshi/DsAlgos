
//852. Peak Index in a Mountain Array
//162. Find Peak Element
public class MountainArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,2,5,6,8,9,7,5,2};
		
		System.out.println(peakIndexInMountainArray(arr));

	}
	
	public static int peakIndexInMountainArray(int[] arr) {
		int start = 0;
		int end= arr.length-1;
		while(start<end) {
			int mid = start + (end-start)/2;
			if(arr[mid]>arr[mid+1]) {
				 end=mid;
			} else {
				start=mid+1;
			}
			
		}
		
        return start;
    }

}
