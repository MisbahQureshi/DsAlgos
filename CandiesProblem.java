import java.util.ArrayList;
import java.util.List;

public class CandiesProblem {

	public static void main(String[] args) {
		int[] arr = {2,3,5,1,3};
		int candies = 3;
		List<Boolean> result = candies(arr, candies);
        System.out.println(result);
	}
	
	static List<Boolean> candies(int[] candies, int extraCandies) {
		 int max=0;
		 List<Boolean> ans=new ArrayList<>();
		 
		 for(int i=0;i<candies.length;i++) {
			 max = Math.max(max, candies[i]);
			 }
		 
		 for(int i=0;i<candies.length;i++) {
			 int tofee = candies[i] + extraCandies;
			 
			 if(tofee >= max){
	                ans.add(true) ;
	                
	            }else{
	                ans.add(false);
	            }
	        }
	        return ans  ;
		
	}

}
