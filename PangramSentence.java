import java.util.Scanner;
//1832. Check if the Sentence Is Pangram
public class PangramSentence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = new String();
		Scanner in = new Scanner(System.in);
		s = in.nextLine();
		System.out.println(charCheck(s));
	}
	
	public static boolean charCheck(String str) {
		boolean b = false;
		for(char ch='a'; ch<='z'; ch++) {
			boolean result = isPangram(ch,str);
			if(result == false) {
				b = false;
				break;
			} else b = true;
		}
		return b; 
	}
	
	public static boolean isPangram(char ch, String str) {
		for(char c : str.toCharArray()) {
			if(c==ch) 
				return true;
			
		}
		return false;
		
	}
	
}
