import java.util.Arrays;

public class SortColors {

	public static void main(String[] args) {
		int[] arr = {2,0,2,1,1,0};
		sortColors(arr);
		System.out.println(Arrays.toString(arr));

	}
	
	 static void sortColors(int[] arr) {
		 int length = arr.length;
		 while(length>0) {
		 for (int i = 0; i < arr.length-1; i++) {
			int temp = arr[i];
			if(arr[i]>arr[i+1]) {
				arr[i] = arr[i+1];
				arr[i+1] = temp;
			}
		}
		 length--;
		 }
	 }

}
