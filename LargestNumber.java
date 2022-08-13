import java.util.Scanner;

public class LargestNumber {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int num1 = in.nextInt();
		int num2= in.nextInt();
		
		int ans = Math.max(num1, num2);
		System.out.println(ans);

	}

}
