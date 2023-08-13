
public class LongestCommonPrefix {

	public static void main(String[] args) {
		String[] strs = {"flower","flow","flight"};
		System.out.println(longestCommonPrefix(strs));
	}
	
	static String longestCommonPrefix(String[] strs) {
		 if (strs == null || strs.length == 0) {
	            return "";
	        }
			int minLength = Integer.MAX_VALUE;
	        for (String str : strs) {
	            minLength = Math.min(minLength, str.length());
	        }
	        StringBuilder sb = new StringBuilder();
	        for (int i = 0; i < minLength; i++) {
	            char ch = strs[0].charAt(i);
	            
	            for (int j = 0; j < strs.length; j++) {
	                if (strs[j].charAt(i) != ch) {
	                    return sb.toString();
	                }
	            }
	            sb.append(ch);
	        }
	        return sb.toString();
        
    }

}
