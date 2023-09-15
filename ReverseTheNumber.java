
public class ReverseTheNumber {

	public static void main(String[] args) {
		int x = 120;
		System.out.println(reverse(x));
	}
	
	 static public int reverse(int x) {
	        int m=0;
	        long n=0;
	        while(x!=0){
	            int r=x%10;
	            x/=10;
	            m=m*10+r;
	            n=n*10+r;
	            if (m!=n)
	                return 0;
	        }
	        return m;
	    }

}
