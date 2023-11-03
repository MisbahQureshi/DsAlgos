
public class ReverseTheWordPosition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "                     hello       ddd     ureshi            ";
		System.out.println(reverseWords(s));

	}
	
	 public static String reverseWords(String s) {
		 String[] words = s.trim().split("\\s+");
		 for (int i = 0; i < words.length/2; i++) {
			 String temp = words[i];
	         words[i] = words[words.length - i - 1];
	         words[words.length - i - 1] = temp;
		}
		 String reversedString = String.join(" ", words).trim();
		return reversedString;
	        
	    }

}
