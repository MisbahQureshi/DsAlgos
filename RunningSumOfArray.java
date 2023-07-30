import java.util.Arrays;

public class RunningSumOfArray {

	public static void main(String[] args) {
		int[] arr = {3,1,2,10,1};
		
		System.out.println(Arrays.toString(runningSum(arr)));
	}
	
	static int[] runningSum(int[] arr) {
		int[] newArr = new int[arr.length];
		int sum=0;
		for(int i=0; i<arr.length;i++) {
			sum+=arr[i];
			newArr[i] = sum;
		}
		return newArr;
		
	}

}
