
public class DefangTheIPAd {

	public static void main(String[] args) {
		String address= "255.1.1.1"; 
		System.out.println(defangIPaddr(address));
	}
	
	 static String defangIPaddr(String address) {
	       StringBuilder sb = new StringBuilder();
	       for(int i=0;i<address.length();i++){
	           if(address.charAt(i)=='.'){
	               sb.append("[");
	               sb.append(".");
	               sb.append("]");
	           }
	           else{
	               sb.append(address.charAt(i));
	           }
	       } 
	       String str = sb.toString();
	       return str;
	        
	    }

}
