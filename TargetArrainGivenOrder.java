import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//1389. Create Target Array in the Given Order

/*
    Input: nums = [0,1,2,3,4], index = [0,1,2,2,1]
	Output: [0,4,1,3,2]
*/
public class TargetArrainGivenOrder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {0,1,2,3,4}; 
		int[] index = {0,1,2,2,1};
		System.out.println(Arrays.toString(createTargetArray(nums,index)));

	}

	 public static int[] createTargetArray(int[] nums, int[] index) {
		 List<Integer> list = new ArrayList<>();
		 int[] target = new int[index.length];
		 for(int i =0; i<nums.length;i++) {
			 list.add(index[i],nums[i]);
		 }
		
		 for(int i =0; i<nums.length;i++) {
			 target[i]=list.get(i);
		 }
		 
		return target;
	        
	    }
}
