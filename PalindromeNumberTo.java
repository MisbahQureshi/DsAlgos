
public class PalindromeNumberTo {

	public static void main(String[] args) {
		int x = -121;
		System.out.println(isPalindrome(x));

	}
	
	static public boolean isPalindrome(int x) {
		if(x<0)return false;
		int temp = x;
		int reverse = 0;
		while(temp!=0) {
			int rem = temp%10;
			reverse=(reverse*10) + rem;
			temp/=10;
		}
		if(reverse==x)return true;
		return false;
        
    }

}
