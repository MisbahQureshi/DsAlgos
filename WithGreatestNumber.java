import java.util.ArrayList;
import java.util.List;

//1431. Kids With the Greatest Number of Candies
public class WithGreatestNumber {

	/*
	 	[2,3,5,1,3], extraCandies = 3
		Output: [true,true,true,false,true] 
	 */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {2,3,5,1,3}; 
		System.out.println(kidsWithCandies(nums,3));

	}

	
	 public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
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
