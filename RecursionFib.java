import java.util.Arrays;

public class RecursionFib {

	static int x = 50;
	static long ar[];
	public static void main(String[] args) {
		
		ar = new long[x+1];
		Arrays.fill(ar, -1);
		System.out.println(fib(x));
		
	}
	
	public static long fib(int x) {
		
		if(x==0) {return 0; }
		if(x==1) {return 1; }
		
		if(ar[x] != -1) { return ar[x]; }
		
		long z= fib(x-1)+fib(x-2);
		ar[x] = z;
		return z;
	}
}
