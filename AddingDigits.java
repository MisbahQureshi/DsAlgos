
public class AddingDigits {

	public static void main(String[] args) {
		System.out.println(addDigits(38));
	}
	
	static public int addDigits(int num) {
		 if (num<10) return num;
	        int ans= helper(num);
	        while(ans>9){
	            ans=helper(ans);
	        }
	        return ans;
    }

		static int helper(int total) {
			 int ans=0;
		        while(total>0){
		            int rem=total%10;
		            total=total/10;
		            ans+=rem;
		        }
		        return ans;
	}

}
