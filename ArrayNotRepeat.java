
public class ArrayNotRepeat {

	public static void main(String[] args) {
		int[]arr= {1,2,6,1,2,3,3,6,4,7,7};
		System.out.println(notDup(arr));
	}

	static int notDup(int[] arr) {
//		int x = 0;
//		for (int i = 0; i < arr.length; i++) {
//			for (int j = i+1; j < arr.length; j++) {
//				if(arr[i]==arr[j]) {
//					break;
//				}
//				else x=arr[i];
//			}
//		} return x;
		
		//bitwise way
		
		int unique =0;
		for(int n: arr) {
			unique^=n;
		}
		return unique;
	}

}
