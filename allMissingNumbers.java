import java.util.ArrayList;
import java.util.List;

public class allMissingNumbers {

	public static void main(String[] args) {
		 int[] arr = {4,3,2,7,8,2,3,1};
	        System.out.println(missingNumber(arr));
	}
	
	static List<Integer> missingNumber(int[] arr) {
		List<Integer> list = new ArrayList<>();
		int i =0;
		while(i<arr.length) {
			 int correctIndex = arr[i]-1;
			 if(arr[i]!=arr[correctIndex]) {
				 int temp = arr[i];
	   	        	arr[i] = arr[correctIndex];
	   	        	arr[correctIndex] = temp;
	    	   } else i++;
			 }
		
		for(int j=0;j<arr.length;j++) {
			if(arr[j]!=j+1) {
				list.add(j+1);
			}
		}
		return list;
	}

}
