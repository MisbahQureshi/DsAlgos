import java.util.Arrays;

public class FistMisingPositiveNumber {

	public static void main(String[] args) {
		int[]arr = {1,2,0};
		System.out.println(firstMissingPositive(arr));
	}
	 static int firstMissingPositive(int[] arr) {
		 Arrays.sort(arr);
		 int count = 1;
		 for (int i = 0; i < arr.length; i++) {
			if(arr[i]==count) count++;
		}
		return count;
		 
	 }

}
