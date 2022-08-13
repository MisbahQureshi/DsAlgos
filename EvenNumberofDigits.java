//1295. Find Numbers with Even Number of Digits
public class EvenNumberofDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {555,901,482,1771, 12,345,2,6,7896}; 
		System.out.println(findNumbers(nums));

	}
	
	public static int findNumbers(int[] nums) {
		int result = 0;
		for(int i=0; i<nums.length;i++) {
			int count=0;
			int ans = nums[i];
			while(ans>0) {
				int rem= ans%10;
				ans/=10;
				count++;
			}
			
			if(count%2==0) {
				result++;
			}
			
		}
		return result;
        
    }

}
