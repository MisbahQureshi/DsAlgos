
public class SortTheSentence {

	public static void main(String[] args) {
		String s = "is2 sentence4 This1 a3"; 
		System.out.println(sortSentence(s));

	}
	
	static String sortSentence(String s) {
		 String[] arr = null;
		 arr = s.split(" ");
		 String[] newArr = new String[arr.length];
		    for (int i = 0; i < arr.length; i++) {
		      int length = arr[i].length();
		      int correctIndex = arr[i].charAt(length - 1) - '1';
		      newArr[correctIndex] = arr[i].substring(0, length - 1);
		    }
		    StringBuilder sb = new StringBuilder();
	        for (int i = 0; i < newArr.length; i++) {
	        	
				sb.append(newArr[i]);
				sb.append(" ");
			}
	        return sb.toString().trim();
        
    }

}
