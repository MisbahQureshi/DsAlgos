import java.util.Scanner;

public class PalindromeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.print("number: ");
		int num = in.nextInt();
		int number = num;
		int ans = 0;
		
		while(num>0) {
			int rem = num%10;
			num/=10;
			ans = ans * 10 + rem;
		}
		
		if(number == ans) {
			System.out.println("yes");
		} else {System.out.println("no");}

	}
}
