import java.util.Arrays;

public class twoSum2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {2,7,11,15};
		int target = 9;
		System.out.println(Arrays.toString(twoSum(arr, target)));
	}
	
	 static int[] twoSum(int[] arr, int target) {
		
		 int start = 0;
		 int end = arr.length - 1;
	        while(start <  end){
	        	
	            if(arr[start] + arr[end] == target){
	                return new int[]{start + 1, end + 1};
	            }else if(arr[start] + arr[end] > target){
	                end--;
	            }else{
	                start++;
	            }
	        }
	        return new int [] {-1,-1};
	        
	    }

}
