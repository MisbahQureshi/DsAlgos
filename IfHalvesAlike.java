
public class IfHalvesAlike {

	public static void main(String[] args) {
		String s = "book"; 
		System.out.println(halvesAreAlike(s));

	}
	    static boolean halvesAreAlike(String s) {
	    	s=s.toLowerCase();
	        String str="aeiou";
	        int count=0;
	        int count2=0;
	        int n=s.length()/2;
	        
	        for(int i=0;i<n;i++){
	            if(str.contains(""+s.charAt(i))){
	                count++;
	            }
	            if(str.contains(""+s.charAt(i+n))){
	                count2++;
	            }
	        }
	        return count==count2;
	    }
	}

