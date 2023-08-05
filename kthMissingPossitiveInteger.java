
public class kthMissingPossitiveInteger {

	public static void main(String[] args) {
		int[]arr= {1,10,21,22,25};
		int k = 12;
		System.out.println(findKthPositive(arr,k));
	}
	static int findKthPositive(int[] arr, int k) {
	    int[] newArr = new int[k];
	    int num = 1, i = 0, j = 0;
	    
	    while (j < k) {
	        if (i < arr.length && arr[i] == num) i++;
	        else {
	        	newArr[j] = num;
	            j++;
	        }
	        
	        num++; 
	    }
	    int missingInt = newArr[k-1];
	    return missingInt;
	}

}
