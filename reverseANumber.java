
public class reverseANumber {
	static int ans =0;
	public static void main(String[] args) {
//		int n = 3765;
//		fun(n);
//		System.out.println(ans);
		System.out.println(rev2(1234));

	}
	static void fun(int n) {
		
		if(n==0) return;
		
		int rem = n%10;
		ans=ans*10 +rem;
		fun(n/10);
		
		
//		int ans =0;
//		while(n>0) {
//			int rem = n%10;
//			ans=ans*10 +rem;
//			n/=10;
//		}
//		return ans;
		
	}
	
	 static int rev2(int n) {
	        int digits = (int)(Math.log10(n)) + 1; //to calculate number of digits
	        return helper(n, digits);
	    }

	    private static int helper(int n, int digits) {
	        if (n%10 == n) {
	            return n;
	        }
	        int rem = n % 10;
	        return rem * (int)(Math.pow(10, digits-1)) + helper(n/10, digits-1);
	    }

}
