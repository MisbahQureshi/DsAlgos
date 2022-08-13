import java.util.Scanner;

//Subtract the Product and Sum of Digits of an Integer 
//leetcode 1281
public class SubtractPS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.print("number: ");
		int num = in.nextInt();
		System.out.println(subtractProductAndSum(num));
	
	}

	
	public static int subtractProductAndSum(int n) {
		int ans=0;
		int ansstar=1;
		while(n>0) {
			
			int rem= n%10;
			ans += rem;
			ansstar *=rem;
			n/=10;
		}
		
		int result = ansstar - ans;
		
		return result;
	}
}
