
public class RichestCustomerWealth {

	public static void main(String[] args) {
		int[][] arr = {{1,5},{7,3},{12,5}};
		
		System.out.println(richestCustomer(arr));
	}
	
	static int richestCustomer(int[][] arr) {
		
		int max=Integer.MIN_VALUE;
		for(int i=0; i<arr.length;i++) {
			int sum=0;
			for(int j =0; j< arr[i].length; j++) {
				sum+=arr[i][j];
			}
			max = Math.max(sum, max);
		}
		return max;
		
	}

}
