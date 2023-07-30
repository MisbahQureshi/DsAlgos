import java.util.Arrays;

public class ShuffleTheArray {

	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5,6};
		int n = 3;
		System.out.println(Arrays.toString(shuffle(arr,n)));
	}
	
	static int[] shuffle(int[] arr, int n) {
		int[] newArr = new int[2*n];
		
		int j=0;
		for(int i = 0; i<2*n;i+=2) {
			newArr[i]=arr[j];
			newArr[i+1] = arr[j+n];
			j++;
		}
		return newArr;
		
	}

}
