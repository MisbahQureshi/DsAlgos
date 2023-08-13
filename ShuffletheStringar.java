
public class ShuffletheStringar {

	public static void main(String[] args) {
		String s = "codeleet"; 
		int[]indices = {4,5,6,7,0,2,1,3};
		System.out.println(restoreString(s, indices));

	}
	
	static String restoreString(String s, int[] indices) {

		char[] newArr = new char[s.length()];
		 for (int i = 0; i < s.length(); i++) {
	          	int correctIndex = indices[i];
	          	newArr[correctIndex] = s.charAt(i);
	        }	
		return String.valueOf(newArr);
        
    }

}
