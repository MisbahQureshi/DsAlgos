import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("enter number: ");
		boolean isPalindrome =false;
		int num= in.nextInt();
		int number = num;
		int ans = 0;
		
		while(num>0) {
			int rem = num%10;
			num/=10;
			ans= ans*10+rem;
		}
		
		if(ans==number)  isPalindrome = true;
			else isPalindrome = false;
		
		System.out.println(isPalindrome);
		}
	}

