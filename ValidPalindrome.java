
public class ValidPalindrome {

	public static void main(String[] args) {
		String s = "A man, a plan, a canal: Panama"; 
		System.out.println(isPalindrome(s));

	}
	 static boolean isPalindrome(String s) {
		 String str = s.toLowerCase();
		 StringBuilder sb = new StringBuilder();
		 
	        for (char c : str.toCharArray()) {
	            if (Character.isLetterOrDigit(c)) {
	                sb.append(c);
	            }
	            }
	       
	        String str2 = sb.toString();
	        int l = 0;
	        int r = str2.length() - 1;
	        
	        while (l < r) {
	            if (str2.charAt(l) != str2.charAt(r)) {
	                return false;
	            }
	            l++;
	            r--;
	        }
	        
	        return true;
	        
	    }

}
