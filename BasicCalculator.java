import java.util.Scanner;

public class BasicCalculator {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		int a = in.nextInt();
		int b= in.nextInt();
		char c = in.next().trim().charAt(0);
		
		System.out.println(calculate(a,b,c));
	}
	
	public static int calculate(int num1, int num2, char op) {
		int ans = 0;
		if(op == '+') {
			ans = num1 + num2;
			return ans;
		}
		
		if(op == '-') {
			ans = num1 - num2;
			return ans;
		}
		
		if(op == '*') {
			ans = num1 * num2;
			return ans;
		}
		
		if(op == '/') {
			ans = num1 / num2;
			return ans;
		}
		
		return ans;
	}
	

}
