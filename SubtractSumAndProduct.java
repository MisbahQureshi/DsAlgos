import java.util.Scanner;

public class SubtractSumAndProduct {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int digit = in.nextInt();
		int result = sumProduct(digit);
		System.out.println(result);

	}
	
	static int sumProduct(int n) {
		int sum=0;
		int product=1;
		while(n>0) {
			int rem = n%10;
			sum+=rem;
			product*=rem;
			n=n/10;
			
		}
		int ans = product - sum;
		return ans;
	}

}
