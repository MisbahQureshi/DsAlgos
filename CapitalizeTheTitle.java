
public class CapitalizeTheTitle {

	public static void main(String[] args) {
		String s = "First leTTeR of EACH Word"; 
		System.out.println(capitalizeTitle(s));

	}
	
	 static String capitalizeTitle(String title) {
		 String[] arr = null;
		 arr = title.split(" ");
		 String[] newArr = new String[arr.length];
		    for (int i = 0; i < arr.length; i++) {
		      if(arr[i].length()==1 || arr[i].length()==2) {
		    	  newArr[i] = arr[i].toLowerCase();		      
		    	  }
		      else {
		    	 char ch =Character.toUpperCase(arr[i].charAt(0));
		    	 String restOfWord = arr[i].substring(1).toLowerCase();
		    	 newArr[i] = ch+restOfWord;
		      }
		    }
		    
		    StringBuilder sb = new StringBuilder();
	        for (int i = 0; i < newArr.length; i++) {
	        	
				sb.append(newArr[i]);
				sb.append(" ");
			}
	        return sb.toString().trim();
	        
	    }

}
