import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("enter string: ");
		String s= in.next();
		if(isPalindrome(s)== false) {
			System.out.println("no");
		}
		else {
			System.out.println("yes");
		}

	}
	
	public static boolean isPalindrome(String s) {
		int i=0;
		int j=s.length()-1;
		while(i<=j) {
			char ch1 = s.charAt(i);
			char ch2 = s.charAt(j);
			
			if(ch1!=ch2) {
				return false;				
			} else {
				i++;
				j--;
				
				}
			
		}
		return true;
		
	}

}
