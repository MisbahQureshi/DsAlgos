/* Define two methods to print the maximum and the minimum number respectively 
 * among three numbers entered by the user.
 */

import java.util.Scanner;

public class MinAndMaxNumber {
	static int ans = 0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("Type three number");
		int num1 = in.nextInt();
		int num2 = in.nextInt();
		int num3 = in.nextInt();
		
		int result = smallest(num1, num2, num3);
		int result2 = largest(num1, num2, num3);
		
		System.out.println(result + ", " + result2);

	}
	
	public static int smallest(int a, int b, int c) {
		int one = Math.min(a, b);
		ans = Math.min(one, c);
		
		return ans;
	}
	
	public static int largest(int a, int b, int c) {
		int one = Math.max(a, b);
		ans = Math.max(one, c);
		
		return ans;
	}
	

}
