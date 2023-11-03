
public class MergeAltStrings {

	public static void main(String[] args) {
		String a= "ab";
		String b = "pqrs";
		System.out.println(mergeAlternately(a,b));

	}
	
	 public static String mergeAlternately(String word1, String word2) {
	        StringBuilder mergedWord = new StringBuilder();
	        int i = 0;
	        while (i < word1.length() || i < word2.length()) {
	            if (i < word1.length()) {
	                mergedWord.append(word1.charAt(i));
	            }
	            if (i < word2.length()) {
	                mergedWord.append(word2.charAt(i));
	            }
	            i++;
	        }
	        return mergedWord.toString();
	    }

}
