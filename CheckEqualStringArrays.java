
public class CheckEqualStringArrays {

	public static void main(String[] args) {
		String[] arr= {"a", "bc"};
		String[] arr2= {"ab", "c"};
		System.out.println(arrayStringsAreEqual(arr,arr2));

	}
	
	static boolean arrayStringsAreEqual(String[] word1, String[] word2) {
		
		String str= "";
		String str2= "";
		
		for (int i = 0; i < word1.length; i++) {
			str+= word1[i];
		}
		for (int i = 0; i < word2.length; i++) {
			str2+=word2[i];
		}
		
		return  str.equals(str2);
        
    }

}
