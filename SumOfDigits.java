
public class SumOfDigits {

	public static void main(String[] args) {
		int n = 12346;
		System.out.println(fun(n));

	}
	
	static int fun(int n) {
		
		if(n==0)return 0;
		return n%10 + fun(n/10);
		
//		int sum =0;
//		while(n>0) {
//			int rem = n%10;
//			sum+=rem;
//			n/=10;
//		}
//		return sum;		
	}
	
	

}
