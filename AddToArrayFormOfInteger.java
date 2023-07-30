import java.util.ArrayList;
import java.util.List;

public class AddToArrayFormOfInteger {

	public static void main(String[] args) {
		int[] arr={2,7,4};
		int k =32;
		System.out.println(addToArrayForm(arr, k));
	}
	
	static List<Integer> addToArrayForm(int[] arr, int k) {
		int number=0;
		for (int i = 0; i < arr.length; i++) {
			number = (number*10) + arr[i];
			
		}
		int result = number+k;
		List<Integer> list = new ArrayList<>();

		String numberString = Integer.toString(result);
		for (char c : numberString.toCharArray()) {
	        int digit = Character.getNumericValue(c);
	        list.add(digit);
	    }

		
		return list;
	        
	    }

}
