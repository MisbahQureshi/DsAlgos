import java.util.Arrays;

public class SquareAndSort {

	public static void main(String[] args) {
		int[] arr = {-4,-1,0,3,10};
		System.out.println(Arrays.toString(sortedSquares(arr)));
	}
	
	static int[] sortedSquares(int[] nums) {
		int[] newArr = new int[nums.length];
		for (int i = 0; i < nums.length; i++) {
			newArr[i]= nums[i]*nums[i];
		}		
		selection(newArr);
		return newArr;      
    }
	
	static void selection(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int last = arr.length - i - 1;
            int maxIndex = getMaxIndex(arr, 0, last);
            swap(arr, maxIndex, last);
        }
    }

    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

    static int getMaxIndex(int[] arr, int start, int end) {
        int max = start;
        for (int i = start; i <= end; i++) {
            if (arr[max] < arr[i]) {
                max = i;
            }
        }
        return max;
    }

}
