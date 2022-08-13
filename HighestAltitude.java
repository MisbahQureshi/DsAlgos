//1732. Find the Highest Altitude
public class HighestAltitude {
	//Input: gain = [-5,1,5,0,-7]
	//Output: 1

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {-5,1,5,0,-7};
		System.out.println(largestAltitude(arr));
	}
	
	public static int largestAltitude(int[] gain) {
		int altitude = 0;
		int result = 0;
		for(int i = 0; i<gain.length; i++) {
			altitude += gain[i];
			result = Math.max(result, altitude);
			
		}
		
		return result;
        
    }

}
