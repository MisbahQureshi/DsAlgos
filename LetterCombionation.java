import java.util.ArrayList;

public class LetterCombionation {

	public static void main(String[] args) {	
		String digits = "23";
		subseq("",digits);
		System.out.println();
		System.out.println(subseq2("",digits));
	}
	
	 
	 static void subseq(String p, String up) {
		 if(up.isEmpty()) {
			 System.out.print(p+" ");
			 return;
			 }
		 int digit = up.charAt(0)-'0';
		 for(int i=(digit-1)*3;i<digit*3;i++) {
			 char ch =(char)('a'+i);
			 subseq(p+ch,up.substring(1));
		 }
	}
	 
	 static ArrayList<String> subseq2(String p, String up) {
		 if(up.isEmpty()) {
			 ArrayList<String> list = new ArrayList<>();
			 list.add(p);
			 return list ;
			 }
			 
		 int digit = up.charAt(0)-'0';
		 ArrayList<String> list = new ArrayList<>();
		 for(int i=(digit-1)*3;i<digit*3;i++) {
			 char ch =(char)('a'+i);
			 list.addAll(subseq2(p+ch,up.substring(1)));
		 }
		 return list;
	}

}
