import java.util.Arrays;

public class ArraywithPermutations {

	public static void main(String[] args) {
		int[] arr = {5,0,1,2,3,4};
		
		System.out.println(Arrays.toString(arrayFromPermutation(arr)));
	}
	
	static int[] arrayFromPermutation(int[] arr) {
		int[] newArr = new int[arr.length];
		for(int i=0; i<arr.length;i++) {
			newArr[i] = arr[arr[i]];
		}
		return newArr;
		
	}

}
