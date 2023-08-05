
public class GuessGame {

	public static void main(String[] args) {
		int n = 10;
		
		System.out.println(guessNumber(n));
	}
	
	 static int guessNumber(int n) {
		 int start=0;
		 int end=n;
	        while(start<=end)
	        {
	            int mid=start+(end-start)/2;
	            int x= guess(mid);
	            if(x==0) 
	            {
	                return mid;
	            }
	            else if(x==-1)
	            {
	                end=mid-1;
	            }
	            else
	            {
	                start = mid+1;
	            }
	        }
	        return -1;
 }
	 static int guess(int x) {
		int pick = 4;
		if(x>pick) return -1;
		if(x<pick) return 1;
		else return 0;
		 
	 }

}
