
public class GoodPair {

	public static void main(String[] args) {
		int[] arr = {1,2,3,1,1,3};
		System.out.println(numIdenticalPairs(arr));

	}
	
	static int numIdenticalPairs(int[] arr) {
		int count=0;
		for(int i=0; i<arr.length;i++ ) {
			for(int j=i+1; j<arr.length;j++ ) {
				if(arr[i]==arr[j])count++;
			}
		}
		return count; 
	}

}
