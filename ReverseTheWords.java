
public class ReverseTheWords {

	public static void main(String[] args) {
		String s = "Let's take LeetCode contest"; 
		System.out.println(reverseWords(s));

	}
	static String reverseWords(String s) {
		 String[] arr = null;
		 arr = s.split(" ");
		 String[] newArr = new String[arr.length];
		    for (int i = 0; i < arr.length; i++) {
		     newArr[i] = reverse(arr[i]);
		    }
		    
		    StringBuilder sb = new StringBuilder();
	        for (int i = 0; i < newArr.length; i++) {
	        	
				sb.append(newArr[i]);
				sb.append(" ");
			}
	        return sb.toString().trim();
    }
	
	 static String reverse(String str) {
        StringBuilder stringBuilder = new StringBuilder(str);
        stringBuilder.reverse();
        return stringBuilder.toString();
        }

}
