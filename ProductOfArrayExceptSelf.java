import java.util.Arrays;

public class ProductOfArrayExceptSelf {

	public static void main(String[] args) {
		int[] arr = {-1,1,0,-3,3};
		System.out.println(Arrays.toString(productOfTheArray(arr)));
	}
	
	static int[] productOfTheArray(int[] arr) {
		int[] newArr = new int[arr.length];
		
		for(int h=0; h<arr.length;h++) {
			int product = 1; 
		for (int i = 0; i < arr.length; i++) {
			if (i != h) { 
                product *= arr[i];
            }
		}
			newArr[h]=product;
		}
		return newArr;
		
	}

}
