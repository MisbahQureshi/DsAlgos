
public class JumpGame {

	public static void main(String[] args) {
		int[]arr = {3,2,1,0,4};
		System.out.println(jump(arr));
	}
	 static boolean jump(int[] arr) {
		 int lastInt = 0;
		 
	       for(int i = 0; i < arr.length; i++) {
	           if(i > lastInt) return false;
	           lastInt = Math.max(lastInt, i+arr[i]);
	       } 
	       return true;

	}

}
