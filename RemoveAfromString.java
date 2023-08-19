
public class RemoveAfromString {

	public static void main(String[] args) {
		removeAfromString("bacaadirejujahoooo");
		skip("","misbah");
		
		System.out.println(skipS("misbah I am amazing"));

	}
	//normal approach
	static void removeAfromString(String str) {
		StringBuilder sb =  new StringBuilder();
		for(int i=0; i<str.length();i++) {
			if(str.charAt(i)!='a') {
				sb.append(str.charAt(i));
			}
			
//			for vowels
//			if(str.charAt(i)!='a' && str.charAt(i)!='e' && str.charAt(i)!='i' && str.charAt(i)!='o' && str.charAt(i)!='u') {
//				sb.append(str.charAt(i));
//			}
		}
		System.out.println(sb.toString());
	}
	//recursive approach
	
	static void skip(String p, String up) {
		if(up.isEmpty()) {
			System.out.println(p);
			return;
		}
		char ch = up.charAt(0);
		if(ch=='a')skip(p,up.substring(1));
		else skip(p+ch,up.substring(1));
		}
	
	//when return type is string 
	static String skipS( String up) {
		if(up.isEmpty()) {
			return "";
		}
		char ch = up.charAt(0);
		if(ch=='a') return skipS(up.substring(1));
		else return ch+skipS(up.substring(1));
		}


}
