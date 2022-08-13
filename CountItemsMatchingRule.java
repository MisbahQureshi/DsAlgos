import java.util.List;

//1773. Count Items Matching a Rule
public class CountItemsMatchingRule {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	 public static int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
		 int index = 0;
		 int count=0;
		 if(ruleKey.equals("color"))
			 index = 1;
		 else if(ruleKey.equals("name"))
			 index = 2;
		 
		 for(List<String> item : items) {
			 if(item.get(index).equals(ruleValue))
				 ++count;
		 }
		 
		return count;
	        
	    }
}
