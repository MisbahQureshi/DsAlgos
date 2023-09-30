import java.util.ArrayList;
import java.util.List;

public class IsAcronym {

	public static void main(String[] args) {
		List<String> l = new ArrayList<>();
        l.add("an");
        l.add("apple");
        
        String s = "aa";
        System.out.println(l.toString());
        System.out.println(isAcronym(l, s));

	}
	
	static public boolean isAcronym(List<String> words, String s) {
		if(words.size()!=s.length())return false;
		for (int i = 0; i < words.size(); i++) {
            String name = words.get(i);
            char ch = name.charAt(0);
            if(ch!= s.charAt(i))return false;
        }
		
		return true;
    }

}
