
public class EvenNumbersOfDigits {

	public static void main(String[] args) {
		int[] arr = {12,345,2,6,7896};
		System.out.println(findNumbers(arr));
	}
	
	static int findNumbers(int[] arr) {
		int even = 0;
		for (int i = 0; i < arr.length; i++) {
			int count =0;
			int n = arr[i];
			while(n>0) {
				int rem = n%10;
				n/=10;
				count++;
			}
			if(count%2==0) {
				even++;
			}
			
		}
		return even;
	}
}
