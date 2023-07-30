import java.util.Arrays;

public class NumberSmallerThanCurrent {

	public static void main(String[] args) {
		int[] arr = {8,1,2,2,3};
		System.out.println(Arrays.toString(numberSmaller(arr)));
	}
	
	static int[] numberSmaller(int[] arr) {
		int[] newArr = new int[arr.length];
		int count=0;
		for(int i = 0; i<arr.length;i++) {
			count =0;
			for(int j = 0; j<arr.length;j++) {
			if(arr[i]>arr[j]) count++;
			}
			newArr[i]=count;
			
		}
		return newArr;
		
	}

}
