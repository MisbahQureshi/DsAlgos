import java.util.Arrays;

public class ConcateOfArray {

	public static void main(String[] args) {
		int[] arr = {2,5,4,6,8,3,5,6};
		
		System.out.println(Arrays.toString(arrayConcat(arr)));
	}
	
	static int[] arrayConcat(int[] arr) {
		int[] newArr = new int[arr.length*2];
		for(int i=0; i<arr.length;i++) {
			newArr[i] = arr[i];
			newArr[i+(arr.length)] = arr[i];
		}
		return newArr;
		
	}

}
