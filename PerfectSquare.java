
public class PerfectSquare {

	public static void main(String[] args) {
		int x=14;
		System.out.println(mySqrt(x));

	}
	    static boolean mySqrt(int x) {
	            if (x == 0 || x == 1)
	            return true;

	        int start = 1;
	        int end = x;
	        while (start <= end) {
	          int  mid = start + (end - start) / 2;
	            
	            if ((long) mid * mid > (long) x)
	                end = mid - 1;
	            else if (mid * mid == x)
	                return true;
	            else
	                start = mid + 1;
	        }

	        return false;
	    }
}
