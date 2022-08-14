import java.util.Arrays;

//1304. Find N Unique Integers Sum up to Zero
public class NSumZero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number = 10;
		System.out.println(Arrays.toString(sumZero(number)));
	}
	
	public static int[] sumZero(int n) {
		int[] arr = new int[n];
			for(int i = 0; i<n-1; i+=2) {
				 arr[i] = (i+1);
				 arr[i+1] = -(i+1);
				 if(n%2!=0) {
					 arr[n-1]=0;
				 }
		}
		
		return arr;
        
    }

}
