//1217. Minimum Cost to Move Chips to The Same Position
public class MoveChips {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,2,2,2,2};
		System.out.println(minCostToMoveChips(arr));
	}
	
	 public static int minCostToMoveChips(int[] position) {
	        int even=0;
	        int odd=0;
	        
	        for(int i=0;i<position.length;i++){
	            if(position[i]%2==0)
	                ++odd;
	             else
	                ++even;
	                       
	        }
	        
	        return Math.min(odd,even);
	        
	        
	    }

}
