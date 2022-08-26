//1095. Find in Mountain Array
public class MountainArraySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,2,5,6,8,9,7,5,2};
		int target = 8;
		
		System.out.println(ans(arr,target));

	}
	
	public static int ans(int[]arr, int target) {
		int peak = peakIndexInMountainArray(arr);
		int tryOne = orderAgnosticBS(arr,target,0,peak);
		if(tryOne!= -1) {return tryOne;}
		return orderAgnosticBS(arr,target,peak,arr.length-1);
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
	
	
	public static int orderAgnosticBS(int[] arr, int target, int start, int end) {

        boolean isAsc = arr[start] < arr[end];

        while(start <= end) {

            int mid = start + (end - start) / 2;

            if (arr[mid] == target) {
                return mid;
            }

            if (isAsc) {
                if (target < arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else {
                if (target > arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return -1;
    }

}
