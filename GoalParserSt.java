
public class GoalParserSt {

	public static void main(String[] args) {
		String s = "G()()()()(al)"; 
		System.out.println(interpret(s));


	}
	 static String interpret(String command) {
		 StringBuilder sb= new StringBuilder();
		 for(int i=0;i<command.length();i++) {
			 char ch = command.charAt(i);
			 if(ch=='G') sb.append(ch);
			 else if(ch=='(' && command.charAt(i+1)==')') {
				 sb.append("o");
				 i++;
			 }
			 else {
	                sb.append('a');
	                sb.append('l');
	                i+=3;
	            }
		 }
		 String str = sb.toString();
		return str;
	        
	    }

}
