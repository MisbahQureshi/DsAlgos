
public class LegthOfLastWord {

	public static void main(String[] args) {
		String s="fly me to the moon   ";
		System.out.println(lengthOfLastWord(s));
	}
	static public int lengthOfLastWord(String s) {
		String ss = s.trim();
		int count =0;
		for (int i = ss.length()-1; i >= 0; i--) {
			if(ss.charAt(i)==' ') break;
			count++;
		}
		return count;
        
    }

}
